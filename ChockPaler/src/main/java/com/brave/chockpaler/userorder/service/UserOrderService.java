package com.brave.chockpaler.userorder.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.servlet.ModelAndView;



public interface UserOrderService {
	public void getList(ModelAndView mView,String id);
	public void addCart();
	
}
