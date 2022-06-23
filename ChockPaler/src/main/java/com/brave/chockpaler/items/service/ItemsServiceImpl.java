package com.brave.chockpaler.items.service;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

//import org.omg.CORBA.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.brave.chockpaler.items.dao.ItemsDao;
import com.brave.chockpaler.items.dto.ItemsDto;
import com.brave.chockpaler.util.pageUtil;

@Service
public class ItemsServiceImpl implements ItemsService {
	
	@Autowired
	private ItemsDao dao;

	@Override
	public ItemsDto getItemData(int num) {
		
		return dao.getData(num);
		
	}

	@Override
	public List<ItemsDto> getItemList(pageUtil pUtil, String item_type) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("pUtil", pUtil);
		map.put("item_type", item_type);
		return dao.getList(map);
	}

	@Override
	public int getItemCount() {
		return dao.getCount();
	}


	@Override
	public void delete(int num) {
		dao.delete(num);		
	}

//	@Override
//	public void saveImage(ItemsDto dto, HttpServletRequest request) {
//		//업로드된 이미지의 정보를 가지고있는 MultipartFile 객체의 참조값 얻어오기
//		MultipartFile image=dto.getImg();
//		//저장할 파일 이름 만들기 위해서 사용됨
//		String orgImgName= image.getOriginalFilename();
//		//webapp/upload 폴더 까지의 실제 경로 (서버의 파일 시스템 상에서의 경로)
//		String realPath= request.getServletContext().getRealPath("/upload");
//		// db에 저장할 이미지의 상세 경로
//		String imgPath=realPath+ File.separator;
//		//디렉토리 만들 파일 객체 생성
//		File upload = new File(imgPath);
//		if(!upload.exists()) {
//			upload.mkdir();
//		}
//		//저장할 이미지의 이름을 구성한다 
//		String saveImgName = System.currentTimeMillis() + orgImgName;
//		try {
//			//upload 폴더에 파일을 저장한다
//			image.transferTo(new File(imgPath+saveImgName));
//			System.out.println();
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		String img=(String)request.getSession().getAttribute("img");
//		dto.setImgPath("/upload"+saveImgName);
//		
//		dao.insert(dto);
//
//	}

	@Override
	public void insert(ItemsDto dto, HttpServletRequest request) {
		
		//업로드된 파일의 정보를 가지고 있는 MultipartFile 객체의 참조값을 얻어오기
		MultipartFile image = dto.getmImg(); // form 에 <input type="file"> 인 부분에 대한 참조값을 담는부분
		//원본 파일명 -> 저장할 파일 이름 만들기위해서 사용됨
		String orgFileName = image.getOriginalFilename();
				
		// webapp/upload 폴더 까지의 실제 경로(서버의 파일 시스템 상에서의 경로)
		String realPath = request.getServletContext().getRealPath("/upload");
		//db 에 저장할 저장할 파일의 상세 경로
		String filePath = realPath + File.separator;
		//디렉토리를 만들 파일 객체 생성
		File upload = new File(filePath);
		if(!upload.exists()) {
			//만약 디렉토리가 존재하지X
			upload.mkdir();//폴더 생성
		}
		//저장할 파일의 이름을 구성한다. -> 우리가 직접 구성해줘야한다.
		String saveFileName = System.currentTimeMillis() + orgFileName;
				
		try {
			//upload 폴더에 파일을 저장한다.
			image.transferTo(new File(filePath + saveFileName));
			System.out.println();	//임시 출력
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		dto.setImg("/upload/" + saveFileName);
				
		//GalleryDao 를 이용해서 DB 에 저장하기
		dao.insert(dto);
	}

}























