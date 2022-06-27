package com.brave.chockpaler.buy.dto;

public class BuyDto {
	
	private int order_num; // 주문번호
	private String id; // 회원 id
	private String addr; // 수령받을 주소
	private String client_name; // 주문자 이름
	private String name; // 상품 이름
	private int count; // 상품갯수
	private int price; // 상품가격
	
	public BuyDto() {}

	public BuyDto(int order_num, String id, String addr, String client_name, String name, int count, int price) {
		super();
		this.order_num = order_num;
		this.id = id;
		this.addr = addr;
		this.client_name = client_name;
		this.name = name;
		this.count = count;
		this.price = price;
	}

	public int getOrder_num() {
		return order_num;
	}

	public void setOrder_num(int order_num) {
		this.order_num = order_num;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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
}
