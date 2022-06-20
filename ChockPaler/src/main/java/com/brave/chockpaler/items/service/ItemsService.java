package com.brave.chockpaler.items.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.brave.chockpaler.items.dto.ItemsDto;
import com.brave.chockpaler.util.pageUtil;

public interface ItemsService {
	
	public ItemsDto getItemData(int num);
	
	public List<ItemsDto> getItemList(pageUtil util);
	
	public int getItemCount();

	public void insert(ItemsDto dto);
}
