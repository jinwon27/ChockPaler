package com.brave.chockpaler;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.brave.chockpaler.items.dto.ItemsDto;
import com.brave.chockpaler.items.service.ItemsService;
import com.brave.chockpaler.util.pageUtil;

@Controller
public class HomeController {
	
	@Autowired
	private ItemsService service;
	
	@RequestMapping("/home")
	public String home(HttpServletRequest request, @RequestParam(defaultValue="1") int curPage) {
		
		List<String> list=new ArrayList<String>();
		list.add("촠팔러");
		
		request.setAttribute("list", list);
		
		pageUtil pUtil = new pageUtil(service.getItemCount(), curPage);
		request.setAttribute("itemList", service.getItemList(pUtil));
		
		request.setAttribute("startPageNum", pUtil.getPageBegin());
		request.setAttribute("endPageNum", pUtil.getPageEnd());
		request.setAttribute("pageUtil", pUtil);
		
		return "home";
	}
	
}
