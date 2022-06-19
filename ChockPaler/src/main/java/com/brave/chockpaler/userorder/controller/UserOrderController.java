package com.brave.chockpaler.userorder.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.brave.chockpaler.userorder.service.UserOrderService;
@Controller
public class UserOrderController {
	@Autowired
	private UserOrderService service;
	
	
	
}
	
	//해당 .do 메서드 매핑되는 곳
	//웹에 " 주문이 완료되었습니다 "
	// return "주문 최종 cofirm 보여주는 주소"
	

