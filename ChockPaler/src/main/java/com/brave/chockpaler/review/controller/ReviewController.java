package com.brave.chockpaler.review.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.brave.chockpaler.review.dto.ReviewDto;
import com.brave.chockpaler.review.service.ReviewService;

@Controller
public class ReviewController {

	@Autowired
	ReviewService service;
	
	@RequestMapping("/review/addreview")
	public String review(ReviewDto dto) {
	
		service.addReview(dto);
		return "redirect:/items/iteminfo.do?num="+dto.getItem_num();
	}
}
