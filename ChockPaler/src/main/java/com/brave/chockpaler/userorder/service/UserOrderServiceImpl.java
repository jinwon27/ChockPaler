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
	public void insert(UserOrderDto dto) {
		userorderDao.insert(dto);				
	}
	
	public void getList(ModelAndView mView) {
		
		List<UserOrderDto> list=userorderDao.getList(null);
		
		mView.addObject("list", list);

	}

	@Override
	public List<UserOrderDto> listCart(String id) {
		
		return userorderDao.getList(id);
	}

	@Override
	public void deleteCart(int NUM) {
		userorderDao.deleteCart(NUM);
		
	}

	@Override
	public void deleteAll(String id) {
		userorderDao.deleteAll(id);
		
	}

	@Override
	public void update(int NUM) {
		
		userorderDao.update(NUM);
	}

	@Override
	public int sumPrice(String id) {
		
		return userorderDao.sumPrice(id);
	}

	@Override
	public void updateCart(UserOrderDto dto) {
		userorderDao.updateCart(dto);
		
	}

	@Override
	public void modifyCart(UserOrderDto dto) {
		userorderDao.modifyCart(dto);
		
	}
	
	@Override
	public List<UserOrderDto> cartPrice() {
		// TODO Auto-generated method stub
		return userorderDao.cartPrice();
	}

	

}
