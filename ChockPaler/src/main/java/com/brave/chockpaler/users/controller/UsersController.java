package com.brave.chockpaler.users.controller;

import java.net.URLEncoder;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.brave.chockpaler.users.dto.UsersDto;
import com.brave.chockpaler.users.service.UsersService;


@Controller
public class UsersController {
	
	@Autowired
	private UsersService service;
	
	@RequestMapping(value = "/users/signupform", method = RequestMethod.GET)
	public String signupForm() {
		
		return "users/signupform";
	}
	
	@RequestMapping(value = "/users/signup", method = RequestMethod.POST)
	public ModelAndView signup(ModelAndView mView, UsersDto dto) {
		
		service.addUser(dto);
		
		mView.setViewName("users/signup");
		return mView;
	}
	
	@RequestMapping("/users/loginform")
	public String loginform() {
		
		return "users/loginform";
	}
	
	@RequestMapping("/users/login")
	public ModelAndView login(ModelAndView mView, UsersDto dto,
			@RequestParam String url, HttpSession session) {
		
		service.loginProcess(dto, session);
		
		String encodedUrl=URLEncoder.encode(url);
		mView.addObject("url", url);
		mView.addObject("encodedUrl", encodedUrl);
		
		mView.setViewName("users/login");
		return mView;
	}
	
	@RequestMapping("/users/info")
	public ModelAndView authInfo(HttpSession session, ModelAndView mView, 
			HttpServletRequest request) {
		
		service.getInfo(session, mView);
		
		mView.setViewName("users/info");
		return mView;
	}
	
	@RequestMapping("/users/checkid")
	@ResponseBody
	public Map<String, Object> checkid(@RequestParam String inputId){
		//UsersService 가 리턴해주는 Map 을 리턴해서 json 문자열을 응답한다. 
		return service.isExistId(inputId);
	}
}
