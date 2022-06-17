package com.brave.chockpaler;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.brave.chockpaler.items.dto.ItemsDto;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home(HttpServletRequest request) {
		
		List<String> list=new ArrayList<String>();
		list.add("촠팔러");
		
		request.setAttribute("list", list);
		
		return "home";
	}
	
}
