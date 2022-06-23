package com.brave.chockpaler.basket.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.brave.chockpaler.basket.dto.basketDto;
import com.brave.chockpaler.basket.service.basketService;

@Controller
public class basketController {
	
	@Autowired 
	private basketService service;
	
	@RequestMapping("/basket/insert.do")
	public ModelAndView authBasketList(HttpSession session, ModelAndView mView, 
			HttpServletRequest request, basketDto dto) {
		
		service.addGoods(dto);
		mView.setViewName("basket/insert");
		return mView;
	}
}
