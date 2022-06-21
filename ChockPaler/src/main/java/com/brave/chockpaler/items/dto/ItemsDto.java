package com.brave.chockpaler.items.dto;

import org.springframework.web.multipart.MultipartFile;

public class ItemsDto {
	
	private String item_type; //cookie or 멀라 ㅠ
	private int item_num; // seq.NEXTVAL
	private String name; // 상품 이름
	private String detail; // 상품 설면
	private int price; // 가격 설정
	private int starPoint; 
	private String regdate; 
	private String img; // 이미지 저장 경로
	private int remain_count; // 재고는 처음에 설정해줘야댐 몇개 있는지
//	private String imgPath;//이미지 저장경로
	
	public ItemsDto() {}
	
	public ItemsDto(String item_type, int item_num, String name, String detail, int price, int starPoint, String regdate,
			String img, int remain_count) {
		super();
		this.item_type = item_type;
		this.item_num = item_num;
		this.name = name;
		this.detail = detail;
		this.price = price;
		this.starPoint = starPoint;
		this.regdate = regdate;
		this.img = img;
		this.remain_count = remain_count;
	}
	
	public String getItem_type() {
		return item_type;
	}
	public void setItem_type(String item_type) {
		this.item_type = item_type;
	}
	public int getItem_num() {
		return item_num;
	}
	public void setItem_num(int item_num) {
		this.item_num = item_num;
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
	public int getRemain_count() {
		return remain_count;
	}
	public void setRemain_count(int remain_count) {
		this.remain_count = remain_count;
	}
	
}
