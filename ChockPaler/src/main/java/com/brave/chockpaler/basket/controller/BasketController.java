package com.brave.chockpaler.basket.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.brave.chockpaler.basket.dto.BasketDto;
import com.brave.chockpaler.basket.service.BasketService;

@Controller
public class BasketController {
	
	@Autowired 
	private BasketService service;
	
	@RequestMapping("/buy/buy")
	public ModelAndView Buy(ModelAndView mView, HttpSession session, BasketDto dto, HttpServletRequest request) {
		
		mView.setViewName("buy/buy");
		return mView;
	}
	
	@RequestMapping("/basket/insert.do")
	public ModelAndView authInsert(HttpSession session, ModelAndView mView, 
			HttpServletRequest request, BasketDto dto) {
		dto.setId((String)session.getAttribute("id"));
		boolean isInsert = service.addGoods(dto);
		mView.addObject("isInsert", isInsert);
		mView.setViewName("basket/insert");
		return mView;
	}
	
	@RequestMapping("/basket/basketList")
	public ModelAndView authgetList(HttpSession session, ModelAndView mView, 
			HttpServletRequest request) {
		
		service.getGoods(session, mView);
		mView.setViewName("basket/basketList");
		return mView;
	}
	
	
}
