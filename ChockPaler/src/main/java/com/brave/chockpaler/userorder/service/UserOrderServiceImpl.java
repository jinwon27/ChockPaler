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
	

	

}
