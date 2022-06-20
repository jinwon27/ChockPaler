package com.brave.chockpaler.items.dao;

import java.util.List;

import com.brave.chockpaler.items.dto.ItemsDto;
import com.brave.chockpaler.util.pageUtil;

public interface ItemsDao {
	
	public ItemsDto getData(int num);
	
	public List<ItemsDto> getList(pageUtil util);
	
	public int getCount();
	
	public void insert(ItemsDto dto);

	void delete(int num);
}
