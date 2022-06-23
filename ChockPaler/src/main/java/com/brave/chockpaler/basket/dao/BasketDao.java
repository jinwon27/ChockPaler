package com.brave.chockpaler.basket.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.brave.chockpaler.basket.dto.BasketDto;

public interface BasketDao {
	//장바구니에 담기
	public void insert(BasketDto dto);
	//장바구니 목록불러오기
	public List<BasketDto> getList(String id);
	
}
