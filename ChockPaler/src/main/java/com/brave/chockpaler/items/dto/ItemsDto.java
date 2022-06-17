package com.brave.chockpaler.items.dto;

public class ItemsDto {
	
	private String itemType;
	private int num;
	private String name;
	private String detail;
	private int price;
	private int starPoint;
	private String regdate;
	private String img;
	private int remainCount; // JAEGO
	
	public ItemsDto() {}
	
	public ItemsDto(String itemType, int num, String name, String detail, int price, int starPoint, String regdate,
			String img, int remainCount) {
		super();
		this.itemType = itemType;
		this.num = num;
		this.name = name;
		this.detail = detail;
		this.price = price;
		this.starPoint = starPoint;
		this.regdate = regdate;
		this.img = img;
		this.remainCount = remainCount;
	}

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getStarPoint() {
		return starPoint;
	}

	public void setStarPoint(int starPoint) {
		this.starPoint = starPoint;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public int getRemainCount() {
		return remainCount;
	}

	public void setRemainCount(int remainCount) {
		this.remainCount = remainCount;
	}
	
}
