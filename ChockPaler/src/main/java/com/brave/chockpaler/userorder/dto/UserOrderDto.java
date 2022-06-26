package com.brave.chockpaler.userorder.dto;

public class UserOrderDto {
	private int num;
	private String id;
	private String name;
	private String item;
	private int count;
	private int price;
	
	public UserOrderDto() {}

	public UserOrderDto(int num, String id, String name, String item, int count, int price) {
		super();
		this.num = num;
		this.id = id;
		this.name = name;
		this.item = item;
		this.count = count;
		this.price = price;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
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

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
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
	
	
	 
	
}
