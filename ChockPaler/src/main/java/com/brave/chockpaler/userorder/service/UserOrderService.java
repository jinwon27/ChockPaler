package com.brave.chockpaler.userorder.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.servlet.ModelAndView;

import com.brave.chockpaler.userorder.dto.UserOrderDto;



public interface UserOrderService {
	public List<UserOrderDto> cartPrice();
	public void insert(UserOrderDto dto);
	public List<UserOrderDto> listCart(String id);
	public void deleteCart(int NUM);
	public void deleteAll(String id);
	public void update(int NUM);
	public int sumPrice(String id);
	public void updateCart(UserOrderDto dto);
	public void modifyCart(UserOrderDto dto);
	public void getList(ModelAndView mView);
}
