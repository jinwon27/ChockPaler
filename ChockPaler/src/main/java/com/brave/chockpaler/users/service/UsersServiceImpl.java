package com.brave.chockpaler.users.service;

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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateUser(UsersDto dto, HttpSession session) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser(HttpSession session, ModelAndView mView) {
		String id = (String)session.getAttribute("id");
		dao.delete(id);
		session.removeAttribute("id");
		
	}

}
