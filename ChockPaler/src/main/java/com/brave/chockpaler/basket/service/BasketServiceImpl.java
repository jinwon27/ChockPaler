package com.brave.chockpaler.basket.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.brave.chockpaler.basket.dao.BasketDao;
import com.brave.chockpaler.basket.dto.BasketDto;

@Service
public class BasketServiceImpl implements BasketService{

	@Autowired
	private BasketDao dao;
		
	@Override
	public boolean addGoods(BasketDto dto) {
		boolean isInsert = true;
		if(dao.getData(dto.getItem_num()) == null) {
			dao.insert(dto);
			return isInsert;
		}
		else {
			
			isInsert=false;
			return isInsert;
		}
		
		
	}

	@Override
	public ModelAndView getGoods(HttpSession session, ModelAndView mView) {
		String id = (String)session.getAttribute("id");
		List<BasketDto> list = dao.getList(id);
		int sum = 0;
		for(BasketDto tmp:list) {
			sum+=tmp.getPrice();
		}
		mView.addObject("sum", sum);
		mView.addObject("list", list);
		return mView;
	}}
