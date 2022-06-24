package com.brave.chockpaler.items.controller;

import java.lang.ProcessBuilder.Redirect;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.brave.chockpaler.items.dto.ItemsDto;
import com.brave.chockpaler.items.service.ItemsService;
import com.brave.chockpaler.review.dto.ReviewDto;
import com.brave.chockpaler.review.service.ReviewService;

@Controller
public class ItemsController {
	
	@Autowired
	private ItemsService service;
	@Autowired
	private ReviewService rService;
	
	//사진 업로드 & db 저장
//	@RequestMapping(value="/items/upload")
//	public ModelAndView authUpload(ItemsDto dto, HttpServletRequest request) {
//		
//		service.saveImage(dto, request);
//		return new ModelAndView("items/upload");
//		
//	}
	
	//아이템 삭제하기
	@RequestMapping("/items/delete")
	public String delete(ItemsDto dto) {
		return "redirect:/home.do";
	}
	
	
	@RequestMapping("/items/uploadform")
	public String uploadForm(HttpServletRequest request) {
		return "items/uploadform";
	}
	
	@RequestMapping(value = "/items/upload")
	public ModelAndView upload(ItemsDto dto, HttpServletRequest request) {
		// 폼으로 전송된 데이터를 디비에 인설트(저장) 하기
		service.insert(dto, request);
		return new ModelAndView("items/upload");
	}
	
	@RequestMapping("/items/iteminfo.do")
	public String itemInfo(@RequestParam int num, HttpServletRequest request) {
		
		ItemsDto dto = service.getItemData(num);
		List<ReviewDto> list = rService.getReviews();
		request.setAttribute("list", list);
		request.setAttribute("num", num);
		request.setAttribute("dto", dto);
		return "items/iteminfo";
	}
	
}
