package com.brave.chockpaler;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.brave.chockpaler.items.service.ItemsService;
import com.brave.chockpaler.util.pageUtil;

@Controller
public class HomeController {
	
	@Autowired
	private ItemsService service;
	
	@RequestMapping("/home")
	public String home(HttpServletRequest request, 
						@RequestParam(defaultValue="1") int curPage, 
						@RequestParam(defaultValue="") String item_type
						) {
		
		pageUtil pUtil = new pageUtil(service.getItemCount(item_type), curPage);
		
		request.setAttribute("startPageNum", pUtil.getPageBegin());
		request.setAttribute("endPageNum", pUtil.getPageEnd());
		request.setAttribute("pageUtil", pUtil); 
		request.setAttribute("itemList", service.getItemList(pUtil, item_type));
		
		return "home";
	}
	
}
