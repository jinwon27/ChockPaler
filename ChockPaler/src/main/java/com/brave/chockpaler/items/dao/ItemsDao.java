package com.brave.chockpaler.items.dao;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.brave.chockpaler.items.dto.ItemsDto;
import com.brave.chockpaler.util.pageUtil;

public interface ItemsDao {
	
	public ItemsDto getData(int num);
	
	public List<ItemsDto> getList(Map<String, Object> map);
	
	public int getCount();
	
	public int getSearchCount(Map<String, Object> map);
	
	public void insert(ItemsDto dto);

	public void delete(int num);
	
	public void setViewCount(int num);
	
	public List<ItemsDto> getSearchList(Map<String, Object> map);
}
