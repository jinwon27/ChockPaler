package com.brave.chockpaler.items.controller;

import java.lang.ProcessBuilder.Redirect;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.brave.chockpaler.items.dto.ItemsDto;
import com.brave.chockpaler.items.service.ItemsService;

@Controller
public class ItemsController {
	
	@Autowired
	private ItemsService service;
	
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
		// request 영역에 담아줄테니까, iteminfo.jsp 하는 애들아 알아서해 데이터 알아서 잘 뽑아써
		// 난 요기까지야
		request.setAttribute("dto", dto);
		
		return "items/iteminfo";
	}
	
}
