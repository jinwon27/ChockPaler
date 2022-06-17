package com.brave.chockpaler.items.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.servlet.ModelAndView;

import com.brave.chockpaler.items.dto.ItemsDto;

public interface ItemsService {
	//아이템 목록 얻어오기
	public void getList(HttpServletRequest request);
	//업로드된 아이템 저장하기
	public void saveItems(ItemsDto dto);
	//아이템 하나의 정보 얻어오기
	public void getItemsData(int num, ModelAndView mView);
	//아이템 삭제하기
	public void deleteItems(int num);
	//아이템 잘나가는 메뉴 순위 얻어오기?
	public void getBSCount(int num, HttpServletRequest request);

}
