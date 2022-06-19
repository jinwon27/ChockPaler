package com.brave.chockpaler.userorder.dao;



import java.util.List;

import com.brave.chockpaler.userorder.dto.UserOrderDto;


public interface UserOrderDao {
	
	public List<UserOrderDto> getList(String id);
	public int addCart(UserOrderDto dto);
	public int deleteCart(int num);
	public int countCart(UserOrderDto dto);
	
}
