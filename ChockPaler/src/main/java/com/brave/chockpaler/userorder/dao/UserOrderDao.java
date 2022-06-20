package com.brave.chockpaler.userorder.dao;



import java.util.List;

import com.brave.chockpaler.userorder.dto.UserOrderDto;


public interface UserOrderDao {
	public List<UserOrderDto> cartPrice();
	public void insert(UserOrderDto dto);
	public List<UserOrderDto> getList(String id);
	public void deleteCart(int NUM);
	public void deleteAll(String id);
	public void update(int NUM);
	public int countCart(String id,int count);
	public int sumPrice(String id);
	public void updateCart(UserOrderDto dto);
	public void modifyCart(UserOrderDto dto);
	
}
