package com.brave.chockpaler.items.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.brave.chockpaler.items.dto.ItemsDto;
import com.brave.chockpaler.util.pageUtil;

public interface ItemsService {
	
	public ItemsDto getItemData(int num);
	
	public List<ItemsDto> getItemList(pageUtil util, String item_type);
	
	public int getItemCount(String item_type);
	
	public int getSearchCount(String name);

	public void insert(ItemsDto dto, HttpServletRequest request);
	
	public void delete(int num);
	
	public void addViewCount(int num);
	
	public List<ItemsDto> getSearchList(pageUtil pUtil, String name);
}
