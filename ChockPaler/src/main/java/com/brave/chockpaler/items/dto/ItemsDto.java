package com.brave.chockpaler.items.dto;

public class ItemsDto {
	
	private String itemType; //cookie or 멀라 ㅠ
	private int num; // seq.NEXTVAL
	private String name; // 상품 이름
	private String detail; // 상품 설면
	private int price; // 가격 설정
	private int starPoint; 
	private String regdate; 
	private String img; // 이미지 링크 등록
	private int remainCount; // 재고는 처음에 설정해줘야댐 몇개 있는지
	
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
