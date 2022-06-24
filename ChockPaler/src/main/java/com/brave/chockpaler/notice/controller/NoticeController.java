package com.brave.chockpaler.notice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.brave.chockpaler.notice.dto.NoticeDto;
import com.brave.chockpaler.notice.service.NoticeService;

@Controller
public class NoticeController {
	
	@Autowired
	NoticeService service;
	
	@RequestMapping("/notice/list")
	public ModelAndView ShowNotice(ModelAndView mView) {
		mView.addObject("list", service.getList());
		mView.setViewName("notice/list");
		return mView;
	}
	
	@RequestMapping("/notice/detail")
	public ModelAndView Detail(@RequestParam("num") int num, ModelAndView mView) {
		mView.addObject("dto", service.getData(num));
		mView.setViewName("notice/detail");
		return mView;
	}
	
	@RequestMapping("/notice/add")
	public String AddNotice() {
		return "notice/add";
	}
}
