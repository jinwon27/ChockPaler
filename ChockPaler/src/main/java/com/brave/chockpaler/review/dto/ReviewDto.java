package com.brave.chockpaler.review.dto;

public class ReviewDto {
	private int num;
	private String id;
	private int item_num;
	private String content;
	private String regdate;
	
	public ReviewDto() {}

	public ReviewDto(int num, String id, int item_num, String content, String regdate) {
		super();
		this.num = num;
		this.id = id;
		this.item_num = item_num;
		this.content = content;
		this.regdate = regdate;
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

	public int getItem_num() {
		return item_num;
	}

	public void setItem_num(int item_num) {
		this.item_num = item_num;
	}

	public String getComment() {
		return content;
	}

	public void setComment(String content) {
		this.content = content;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	
}
