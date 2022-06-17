package com.brave.chockpaler.items.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.brave.chockpaler.items.dto.ItemsDto;

@Controller
public class ItemsController {
	
	//@Autowired
	//private ItemsService service;
	
	@RequestMapping("/items/uploadform")
	public String uploadForm(HttpServletRequest request) {
		return "items/uploadform";
	}
	
	@RequestMapping("/items/upload.do")
	public String upload(@RequestParam ItemsDto dto) {
		// 폼으로 전송된 데이터를 디비에 인설트(저장) 하기
		//service.saveItems(dto);
		return "items/upload";
	}
}
