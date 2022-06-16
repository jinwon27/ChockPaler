package com.brave.chockpaler.items.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.omg.CORBA.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;

import com.brave.chockpaler.items.dao.ItemsDao;
import com.brave.chockpaler.items.dto.ItemsDto;

public class ItemsServiceImpl implements ItemsService {

	@Autowired
	private ItemsDao dao;
	@Autowired
	private ItemsDto dto;
	
	@Override
	public void getList(HttpServletRequest request) {
		//아이템 목록 얻어오기
		List<ItemsDto> list=dao.getList(dto);
		request.setAttribute("list", list);
		
	}

	@Override
	public void saveItems(ItemsDto dto, ModelAndView mView, HttpServletRequest request) {
		//dto 에 업로드된 아이템의 정보를 담는다
		String item=(String)request.getSession().getAttribute("id");
		//세션에서 읽어낸 아이템 업로더의 아이디
		dto.setName(item);
		//itemsDao 를 이용해서 DB에 저장하기
		dao.insert(dto);
		//view 페이지에서 사용할 모델 담기
		mView.addObject("dto",dto);
		
	}

	@Override
	public void getItemsData(int num, ModelAndView mView) {
		//업로드할 파일의 정보를 얻어와서
		ItemsDto dto=dao.getData(num);
		//모델앤뷰 객체에 담는다
		mView.addObject("dto",dto);
		
	}

	@Override
	public void deleteItems(int num, HttpServletRequest request) {
		//삭제할 아이템의 정보 얻기
		ItemsDto dto=dao.getData(num);
		
		//아이템  번호로 삭제
		int saveItemsName=dto.getItemNum();
		//DB에서 정보 삭제
		dao.delete(num);
	}

	@Override
	public void getBSCount(int num, HttpServletRequest request) {
		//아이템 가져오기
		
		//아이템 잘팔리는 순으로 ...
		
		//1,2,3위까지 보여주기?
		
	}

}
