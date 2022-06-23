package com.brave.chockpaler.basket.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brave.chockpaler.basket.dao.basketDao;
import com.brave.chockpaler.basket.dto.basketDto;

@Service
public class basketServiceImpl implements basketService{

	@Autowired
	private basketDao dao;
		
	@Override
	public void addGoods(basketDto dto) {
		dao.insert(dto);
	}

}
