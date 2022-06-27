package com.brave.chockpaler.basket.dto;

import java.util.List;

public class BasketDto {
	private int item_num;
	private String id;
	private String name;
	private int count;
	private int price;
	private String img;
	
	public BasketDto() {}

	public BasketDto(int item_num, String id, String name, int count, int price, String img) {
		super();
		this.item_num = item_num;
		this.id = id;
		this.name = name;
		this.count = count;
		this.price = price;
		this.img = img;
	}

	public int getItem_num() {
		return item_num;
	}

	public void setItem_num(int item_num) {
		this.item_num = item_num;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

}
