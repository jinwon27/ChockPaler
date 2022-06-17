package com.brave.chockpaler.items.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

//import org.omg.CORBA.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.brave.chockpaler.items.dao.ItemsDao;
import com.brave.chockpaler.items.dto.ItemsDto;

//@Service
//public class ItemsServiceImpl implements ItemsService {

//	@Autowired
//	private ItemsDao dao;
//	@Autowired
//	private ItemsDto dto;
//	
//	@Override
//	public void getList(HttpServletRequest request) {
//		//아이템 목록 얻어오기
//		List<ItemsDto> list=dao.getList(dto);
//		request.setAttribute("list", list);
//		
//	}
//
//	@Override
//	public void saveItems(ItemsDto dto) {
//		dao.insert(dto);
//	}
//
//	@Override
//	public void getItemsData(int num, ModelAndView mView) {
//		//업로드할 파일의 정보를 얻어와서
//		ItemsDto dto=dao.getData(num);
//		//모델앤뷰 객체에 담는다
//		mView.addObject("dto",dto);
//		
//	}
//
//	@Override
//	public void deleteItems(int num) {
//		dao.delete(num);
//	}
//
//	@Override
//	public void getBSCount(int num, HttpServletRequest request) {
//		//아이템 가져오기
//		
//		//아이템 잘팔리는 순으로 ...
//		
//		//1,2,3위까지 보여주기?
//		
//	}

//}
