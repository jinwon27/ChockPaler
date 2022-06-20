package com.brave.chockpaler.orderinquiry.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.brave.chockpaler.orderinquiry.service.OrderInquiryService;

@Controller
public class OrderInquiryController {
	
	@Autowired
	OrderInquiryService service;
	
	@RequestMapping("/orderinquiry/orderinquiry")
	public String OrderInquiryList(HttpSession session, HttpServletRequest request) {
		
		request.setAttribute("dto", service.getDto((String)session.getAttribute("id")));
		return "orderinquiry/list";	
		
	}
}
