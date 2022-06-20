package com.brave.chockpaler.userorder.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.brave.chockpaler.userorder.dto.UserOrderDto;
import com.brave.chockpaler.userorder.service.UserOrderService;
import com.brave.chockpaler.userorder.service.UserOrderServiceImpl;
@Controller
public class UserOrderController {
	@Autowired
	private UserOrderService service;
	
	@RequestMapping("insert.do")
	public String insert(@ModelAttribute UserOrderDto dto,HttpSession session) {
		String id=(String)session.getAttribute("id");
		if(id==null) {
			return "redirect:/users/login.do";
		}
		dto.setId(id);
		service.insert(dto);
		return "redirect:/userorder/userodrderform.do";
	}
	
	@RequestMapping("userorderform.do")
	public ModelAndView list(HttpSession session,ModelAndView mView) {
		Map<String, Object> map=new HashMap<String, Object>();
		String id=(String)session.getAttribute("id");
		if(id!=null) {
			List<UserOrderDto> list=service.listCart(id);
			int sumPrice=service.sumPrice(id);
			
			map.put("sumPrice", sumPrice);
			map.put("list", list);
			map.put("count",list.size());
			
			return mView;
		}else {
			return new ModelAndView("users/login","",null);
		}
	}
	
	@RequestMapping("delete.do")
		public String delete(@RequestParam int NUM) {
		service.deleteCart(NUM);
		return "redirect:/userorder/userodrderform.do";
	}
	
	@RequestMapping("deleteAll.do")
	public String deleteAll(HttpSession session) {
		String id=(String)session.getAttribute("id");
		if(id!=null) {
			service.deleteAll(id);
		}
		return "redirect:/userorder/userodrderform.do"; 
	}
	
	@RequestMapping("update.do")
	public String update(@RequestParam int count, @RequestParam String name,HttpSession session) {
		String id=(String)session.getAttribute("id");
		for (int i=0;i<name.length(); i++) {
			UserOrderDto dto=new UserOrderDto();
			dto.setId(id);
			dto.setCount(count);
			dto.setName(name);
			service.modifyCart(dto);
		}
		return "redirect:/userorder/userodrderform.do";
	}
	
	
}
	
	//해당 .do 메서드 매핑되는 곳
	//웹에 " 주문이 완료되었습니다 "
	// return "주문 최종 cofirm 보여주는 주소"
	

