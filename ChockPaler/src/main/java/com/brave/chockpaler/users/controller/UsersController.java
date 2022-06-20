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
import org.springframework.web.multipart.MultipartFile;
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
	
	@RequestMapping("/users/logout")
	public String logout(HttpSession session) {
		session.removeAttribute("id");
		return "users/logout";
	}
	
	@RequestMapping("/users/pwd_updateform")
	public ModelAndView authPwdUpdateForm(ModelAndView mView, HttpServletRequest request) {
		mView.setViewName("users/pwd_updateform");
		return mView;
	}
	
	@RequestMapping("/users/pwd_update")
	public ModelAndView authPwdUpdate(UsersDto dto, 
			ModelAndView mView, HttpSession session, HttpServletRequest request) {
		//서비스에 필요한 객체의 참조값을 전달해서 비밀번호 수정 로직을 처리한다.
		service.updateUserPwd(session, dto, mView);
		//view page 로 forward 이동해서 작업 결과를 응답한다.
		mView.setViewName("users/pwd_update");
		return mView;
	}
	
	@RequestMapping("/users/updateform")
	public ModelAndView authUpdateForm(ModelAndView mView, HttpSession session,
			HttpServletRequest request) {
		service.getInfo(session, mView);
		mView.setViewName("users/updateform");
		return mView;
	}
	
	@RequestMapping("/users/delete")
	public ModelAndView authDelete(HttpSession session, ModelAndView mView,
			 HttpServletRequest request) {
		
		service.deleteUser(session, mView);
		
		mView.setViewName("users/delete");
		return mView;
	}
	
	@RequestMapping(value = "/users/update", method=RequestMethod.POST)
	public ModelAndView authUpdate(UsersDto dto, HttpSession session, ModelAndView mView,
			 HttpServletRequest request) {
		//서비스를 이용해서 개인정보를 수정하고 
		service.updateUser(dto, session);
		mView.setViewName("redirect:/users/info.do");
		//개인정보 보기로 리다일렉트 이동 시틴다
		return mView;
	}
	
	@RequestMapping(value = "/users/ajax_profile_upload",
			method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> authAjaxProfileUpload(HttpServletRequest request,
			@RequestParam MultipartFile image){
		
		//서비스를 이용해서 이미지를 upload 폴더에 저장하고 리턴되는 Map 을 리턴해서 json 문자열 응답하기
		return service.saveProfileImage(request, image);
	}
	
}
