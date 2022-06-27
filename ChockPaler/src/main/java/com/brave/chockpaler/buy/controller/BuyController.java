package com.brave.chockpaler.buy.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.brave.chockpaler.basket.dto.BasketDto;

@Controller
public class BuyController {

	@RequestMapping("/buy/buyform")
	public ModelAndView buyForm(BasketDto dto, 
										ModelAndView mView, 
										@RequestParam("sum") int sum) {
		
		mView.addObject("dto", dto);
		mView.addObject("sum", sum);
		mView.setViewName("buy/buyform");
		return mView;
	}
}
