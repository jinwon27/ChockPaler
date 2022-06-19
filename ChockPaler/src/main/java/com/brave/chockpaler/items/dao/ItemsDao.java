package com.brave.chockpaler.items.dao;

import java.util.List;

import com.brave.chockpaler.items.dto.ItemsDto;

public interface ItemsDao {
	
	public ItemsDto getData(int num);
	
	public List<ItemsDto> getList();
	
	public int getCount();
}
