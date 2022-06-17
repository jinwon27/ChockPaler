package com.brave.chockpaler.userorder.service;



import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.servlet.ModelAndView;

import com.brave.chockpaler.userorder.dao.UserOrderDao;

import com.brave.chockpaler.userorder.dto.UserOrderDto;






@Service
public class UserOrderServiceImpl implements UserOrderService {
	
	@Autowired
	private UserOrderDao userorderDao;
	

	@Override
	public void getList(ModelAndView mView) {
		
		List<UserOrderDto> list=userorderDao.getList(null);
		
		mView.addObject("list", list);
		
	}
	@Transactional
	@Override
	public void buy(HttpServletRequest request, ModelAndView mView) {
		
		String name=(String)request.getSession().getAttribute("name");
		int item_num=Integer.parseInt(request.getParameter("item_num"));
	
		int price=Integer.parseInt(request.getParameter("price"));

		UserOrderDto dto=new UserOrderDto();
		
		dto.setItem_num(item_num);
		dto.setName(name);
		dto.setPrice(price);
		userorderDao.addOrder(dto);
		userorderDao.getData(dto);
		
		
	}

	@Override
	public void cancel(HttpServletRequest request, ModelAndView mView) {
		int item_num=Integer.parseInt(request.getParameter("item_num"));
		UserOrderDto dto=new UserOrderDto();
		dto.setItem_num(item_num);
		userorderDao.delete(dto);
		
	}
	

	
		
	

}
