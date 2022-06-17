package com.brave.chockpaler.users.dto;

public class UsersDto {
	private int num;
	private String id;
	private String pwd;
	private String name;
	private String email;
	private String profile;
	private String regdate;
	private String gender;
	private String newPwd;
	

	public UsersDto() {}


	public UsersDto(int num, String id, String pwd, String name, String email, String profile, String regdate,
			String gender, String newPwd) {
		super();
		this.num = num;
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.email = email;
		this.profile = profile;
		this.regdate = regdate;
		this.gender = gender;
		this.newPwd = newPwd;
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


	public String getPwd() {
		return pwd;
	}


	public void setPwd(String pwd) {
		this.pwd = pwd;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getProfile() {
		return profile;
	}


	public void setProfile(String profile) {
		this.profile = profile;
	}


	public String getRegdate() {
		return regdate;
	}


	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getNewPwd() {
		return newPwd;
	}


	public void setNewPwd(String newPwd) {
		this.newPwd = newPwd;
	}

	
}
