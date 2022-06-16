package com.brave.chockpaler.userorder.dto;

public class UserOrderDto {
	private int num;;
	private String id;
	private int Item_Code;
	private String addr;
	
	public UserOrderDto() {}
	
	
	

	public UserOrderDto(int num, String id, int item_Code, String addr) {
		super();
		this.num = num;
		this.id = id;
		Item_Code = item_Code;
		this.addr = addr;
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

	public int getItem_Code() {
		return Item_Code;
	}

	public void setItem_Code(int item_Code) {
		Item_Code = item_Code;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
}
