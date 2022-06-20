package com.brave.chockpaler.orderinquiry.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.brave.chockpaler.orderinquiry.service.OrderInquiryService;

@Controller
public class OrderInquiryController {
	
	@Autowired
	OrderInquiryService service;
	
	@RequestMapping("/orderinquiry/orderinquiry")
	public ModelAndView authOrderInquiryList(HttpSession session, HttpServletRequest request,
			ModelAndView mView) {
		
		mView.addObject("dto", service.getDto((String)session.getAttribute("id")));
		mView.setViewName("orderinquiry/list");
		return mView;
	}
}
