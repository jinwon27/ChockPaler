package com.brave.chockpaler;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.brave.chockpaler.items.dto.ItemsDto;
import com.brave.chockpaler.items.service.ItemsService;

@Controller
public class HomeController {
	
	@Autowired
	private ItemsService service;
	
	@RequestMapping("/home")
	public String home(HttpServletRequest request) {
		
		List<String> list=new ArrayList<String>();
		list.add("촠팔러");
		
		request.setAttribute("list", list);
		
		request.setAttribute("itemList", service.getItemList());
		
		return "home";
	}
	
}
