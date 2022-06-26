package com.brave.chockpaler.notice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.brave.chockpaler.notice.dto.NoticeDto;
import com.brave.chockpaler.notice.service.NoticeService;
import com.brave.chockpaler.util.reviewPageUtil;

@Controller
public class NoticeController {
	
	@Autowired
	NoticeService service;
	
	@RequestMapping("/notice/list")
	public ModelAndView ShowNotice(ModelAndView mView, @RequestParam(defaultValue="1") int curPage) {
		
		reviewPageUtil pUtil = new reviewPageUtil(service.getCount(), curPage);
		
		// 얘네들은 없어도 되는것 같은데.. 귀찮아서 일단
		mView.addObject("startPageNum", pUtil.getPageBegin());
		mView.addObject("endPageNum", pUtil.getPageEnd());
		mView.addObject("pageUtil", pUtil);
		//
		
		mView.addObject("list", service.getList(pUtil));
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
	public String AddNoticeForm() {
		return "notice/add";
	}
	
	@RequestMapping("/notice/addnotice")
	public String AddNotice(NoticeDto dto) {
		service.addNotice(dto);
		return "redirect:/notice/list.do";
	}
}
