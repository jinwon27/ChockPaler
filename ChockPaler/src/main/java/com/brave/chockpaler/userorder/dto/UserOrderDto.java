package com.brave.chockpaler.userorder.dto;

public class UserOrderDto {
	private int item_num;
	private String item_type;
	private String name;
	private int price;
	private String img;
	
	
	public UserOrderDto() {}
	
	
	
	public UserOrderDto(int item_num, String item_type, String name, int price, String img) {
		super();
		this.item_num = item_num;
		this.item_type = item_type;
		this.name = name;
		this.price = price;
		this.img = img;
	}



	public int getItem_num() {
		return item_num;
	}
	public void setItem_num(int item_num) {
		this.item_num = item_num;
	}
	public String getItem_type() {
		return item_type;
	}
	public void setItem_type(String item_type) {
		this.item_type = item_type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
