package com.brave.chockpaler.userorder.dao;



import java.util.List;

import com.brave.chockpaler.userorder.dto.UserOrderDto;


public interface UserOrderDao {
	public void addOrder(UserOrderDto dto);
	public List<UserOrderDto> getList(UserOrderDto dto);
	public void delete(UserOrderDto dto);
	public void getData(UserOrderDto dto);
	public void getPrice(UserOrderDto dto);
}
