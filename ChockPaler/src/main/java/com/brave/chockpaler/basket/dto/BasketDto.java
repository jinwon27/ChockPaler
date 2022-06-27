package com.brave.chockpaler.basket.dto;

public class BasketDto {
	private int item_num;
	private String id;
	private String name;
	private int count;
	private int price;
	private String img;
	
	//buy에서 쓸 dto
	private int order_num;
	private String addr;
	private String client_name;
	
	public BasketDto() {}

	public BasketDto(int item_num, String id, String name, int count, int price, String img, int order_num, String addr,
			String client_name) {
		super();
		this.item_num = item_num;
		this.id = id;
		this.name = name;
		this.count = count;
		this.price = price;
		this.img = img;
		this.order_num = order_num;
		this.addr = addr;
		this.client_name = client_name;
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

	public int getOrder_num() {
		return order_num;
	}

	public void setOrder_num(int order_num) {
		this.order_num = order_num;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getClient_name() {
		return client_name;
	}

	public void setClient_name(String client_name) {
		this.client_name = client_name;
	}

	
}
