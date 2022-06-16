package com.brave.chockpaler.items.dao;

import java.util.List;

import com.brave.chockpaler.items.dto.ItemsDto;

public interface ItemsDao {
	
	public List<ItemsDto> getList(ItemsDto dto);
	
	public void insert(ItemsDto dto);
	
	public void delete(int num);
	
	public void update(ItemsDto dto);
	
	public ItemsDto getData(int num);
	
	public ItemsDto SalCount(int num);
	
	
	
}
