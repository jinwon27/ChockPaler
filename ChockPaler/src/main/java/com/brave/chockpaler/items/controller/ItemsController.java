package com.brave.chockpaler.items.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.brave.chockpaler.items.dto.ItemsDto;
import com.brave.chockpaler.items.service.ItemsService;

@Controller
public class ItemsController {
	
	@Autowired
	private ItemsService service;
	
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
	
	@RequestMapping("/items/iteminfo")
	public String itemInfo(int num, HttpServletRequest request) {
		
		ItemsDto dto = service.getItemData(num);
		// request 영역에 담아줄테니까, iteminfo.jsp 하는 애들아 알아서해 데이터 알아서 잘 뽑아써
		// 난 요기까지야
		request.setAttribute("dto", dto);
		
		return "items/iteminfo";
	}
}
