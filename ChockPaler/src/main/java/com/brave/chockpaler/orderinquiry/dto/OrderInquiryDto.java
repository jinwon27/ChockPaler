package com.brave.chockpaler.orderinquiry.dto;

public class OrderInquiryDto {
	private long num; // 주문번호
	private String id; // 회원아이디
	private String addr; // 주소
	private String item_name; // 상품명
	
	public OrderInquiryDto() {}

	public OrderInquiryDto(long num, String id, String addr, String item_name) {
		super();
		this.num = num;
		this.id = id;
		this.addr = addr;
		this.item_name = item_name;
	}

	public long getNum() {
		return num;
	}

	public void setNum(long num) {
		this.num = num;
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

	public String getItem_name() {
		return item_name;
	}

	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	
}
