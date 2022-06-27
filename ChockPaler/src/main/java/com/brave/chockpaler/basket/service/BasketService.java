package com.brave.chockpaler.basket.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;

import com.brave.chockpaler.basket.dto.BasketDto;

public interface BasketService {
	public void addGoods(BasketDto dto);
	public ModelAndView getGoods(HttpSession session, ModelAndView mView);
	public void removeGoods(int item_num);
}
