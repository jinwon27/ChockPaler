package com.brave.chockpaler.buy.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.brave.chockpaler.basket.dto.BasketDto;
import com.brave.chockpaler.basket.dto.Baskets;

@Controller
public class BuyController {

	@RequestMapping("/buy/buyform")
	public ModelAndView buyForm(@RequestBody Baskets baskets, 
										ModelAndView mView, 
										@RequestParam("sum") int sum) {
		
		mView.addObject("list", baskets);
		mView.addObject("sum", sum);
		mView.setViewName("buy/buyform");
		return mView;
	}
	
}
