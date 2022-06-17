package com.brave.chockpaler.userorder.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.servlet.ModelAndView;



public interface UserOrderService {
	public void getList(ModelAndView mView);
	public void buy(HttpServletRequest request,ModelAndView mView);
	public void cancel(HttpServletRequest request,ModelAndView mView);
	
}
