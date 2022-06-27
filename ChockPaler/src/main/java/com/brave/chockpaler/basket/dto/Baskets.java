package com.brave.chockpaler.basket.dto;

import java.util.List;

public class Baskets {
	
	private List<BasketDto> list;
	
	public Baskets() {}

	public Baskets(List<BasketDto> list) {
		super();
		this.list = list;
	}

	public List<BasketDto> getList() {
		return list;
	}

	public void setList(List<BasketDto> list) {
		this.list = list;
	}
}
