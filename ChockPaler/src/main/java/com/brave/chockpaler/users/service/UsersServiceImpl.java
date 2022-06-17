package com.brave.chockpaler.users.service;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.brave.chockpaler.users.dao.UsersDao;
import com.brave.chockpaler.users.dto.UsersDto;

@Service
public class UsersServiceImpl implements UsersService{

	@Autowired
	private UsersDao dao;
	
	@Override
	public Map<String, Object> isExistId(String inputId) {
		
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("isExist", dao.isExist(inputId));
		return map;
			
	}

	@Override
	public void addUser(UsersDto dto) {
		//사용자가 입력한 비밀 번호를 읽어와서 
		String pwd=dto.getPwd();
		//암호화 한 후에 
		BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
		String encodedPwd=encoder.encode(pwd);
		//dto 에 다시 넣어준다.
		dto.setPwd(encodedPwd);
		
		dao.insert(dto);
	}

	@Override
	public void loginProcess(UsersDto dto, HttpSession session) {
		boolean isValid=false;
		
		UsersDto result=dao.getData(dto.getId());
		if(result != null) {
			String encodedPwd=result.getPwd();
			String inputPwd=dto.getPwd();
			isValid=BCrypt.checkpw(inputPwd, encodedPwd);
		}
		
		if(isValid) {
			session.setAttribute("id", dto.getId());
		}
		
	}

	@Override
	public void getInfo(HttpSession session, ModelAndView mView) {
		String id=(String)session.getAttribute("id");
		UsersDto dto=dao.getData(id);
		mView.addObject("dto", dto);
	}

	@Override
	public void updateUserPwd(HttpSession session, UsersDto dto, ModelAndView mView) {
		String id = (String)session.getAttribute("id");
		//session에 id 에 해당하는 비밀번호 인코딩 풀기
		
		//현재 인코딩된 패스워드
		String encodedPwd = dao.getData(id).getPwd();
		//클라이언트가 적어넣은 패스워드
		String inputPwd = dto.getPwd();
		boolean isValid=BCrypt.checkpw(inputPwd, encodedPwd);
		if(isValid) {
			 String newPwd = dto.getNewPwd();
			 //newPwd를 dto에 저장
			 BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
			 String newEncodedPwd=encoder.encode(newPwd);
			 //dto 에 다시 넣어준다.
			 dto.setNewPwd(newEncodedPwd);
			 dto.setId(id);
			 dao.updatePwd(dto);
			 session.removeAttribute("id");
		}
		mView.addObject("isSuccess", isValid);
		mView.addObject("id", id);
		
	}

	@Override
	public Map<String, Object> saveProfileImage(HttpServletRequest request, MultipartFile mFile) {
		//업로드된 파일에 대한 정보를 MultipartFile 객체를 이용해서 얻어낼수 있다.	
		
		//원본 파일명
		String orgFileName=mFile.getOriginalFilename();
		//upload 폴더에 저장할 파일명을 직접구성한다.
		// 1234123424343xxx.jpg
		String saveFileName=System.currentTimeMillis()+orgFileName;
		
		// webapp/upload 폴더까지의 실제 경로 얻어내기 
		String realPath=request.getServletContext().getRealPath("/upload");
		// upload 폴더가 존재하지 않을경우 만들기 위한 File 객체 생성
		File upload=new File(realPath);
		if(!upload.exists()) {//만일 존재 하지 않으면
			upload.mkdir(); //만들어준다.
		}
		try {
			//파일을 저장할 전체 경로를 구성한다.  
			String savePath=realPath+File.separator+saveFileName;
			//임시폴더에 업로드된 파일을 원하는 파일을 저장할 경로에 전송한다.
			mFile.transferTo(new File(savePath));
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		// json 문자열을 출력하기 위한 Map 객체 생성하고 정보 담기 
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("imagePath", "/upload/"+saveFileName);
		
		return map;
	}

	@Override
	public void updateUser(UsersDto dto, HttpSession session) {
		//수정할 회원의 아이디
		String id=(String)session.getAttribute("id");
		//UsersDto 에 아이디도 담아 주고
		dto.setId(id);
		//UsersDao 를 이용해서 수정 반영한다.
		dao.update(dto);
	}

	@Override
	public void deleteUser(HttpSession session, ModelAndView mView) {
		String id = (String)session.getAttribute("id");
		dao.delete(id);
		session.removeAttribute("id");
		
	}

}
