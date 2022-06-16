package com.brave.chockpaler.items.dto;

public class ItemsDto {
	
	private String type;
	private int ItemNum;
	private String name;
	private String detail;
	private int pirce;
	private String byeoljum;
	private String updateDate;
	private String img;
	private int RemainCount;
	private String acron;
	
	public ItemsDto() {}

	public ItemsDto(String type, int itemNum, String name, String detail, int pirce, String byeoljum, String updateDate,
			String img, int remainCount) {
		super();
		this.type = type;
		ItemNum = itemNum;
		this.name = name;
		this.detail = detail;
		this.pirce = pirce;
		this.byeoljum = byeoljum;
		this.updateDate = updateDate;
		this.img = img;
		RemainCount = remainCount;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getItemNum() {
		return ItemNum;
	}

	public void setItemNum(int itemNum) {
		ItemNum = itemNum;
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

	public int getPirce() {
		return pirce;
	}

	public void setPirce(int pirce) {
		this.pirce = pirce;
	}

	public String getByeoljum() {
		return byeoljum;
	}

	public void setByeoljum(String byeoljum) {
		this.byeoljum = byeoljum;
	}

	public String getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public int getRemainCount() {
		return RemainCount;
	}

	public void setRemainCount(int remainCount) {
		RemainCount = remainCount;
	}
	
	
}
