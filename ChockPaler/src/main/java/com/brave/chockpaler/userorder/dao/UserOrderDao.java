package com.brave.chockpaler.userorder.dao;

import java.util.List;

import com.brave.chockpaler.userorder.dto.UserOrderDto;

public interface UserOrderDao {
	public void insert(UserOrderDto dto);
	public UserOrderDto getData(int num);
	public void delete(int num);
	public List<UserOrderDto> getList(UserOrderDto dto);
	public int getCount(UserOrderDto dto);
}
