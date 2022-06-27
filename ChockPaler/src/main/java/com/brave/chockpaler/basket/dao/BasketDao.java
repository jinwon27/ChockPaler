package com.brave.chockpaler.basket.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.brave.chockpaler.basket.dto.BasketDto;

public interface BasketDao {
	//장바구니에 담기
	public void insert(BasketDto dto);
	//장바구니 목록불러오기
	public List<BasketDto> getList(String id);
	//상품번호가 똑같은 상품이 장바구니에 담겨있는지 확인
	public BasketDto getData(int item_num);
	//똑같은게 있으면 수량, 금액 추가해서 update
	public void update(BasketDto dto);
	//장바구니에서 선택항목 삭제
	public void delete(int item_num);
	
}
