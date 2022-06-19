package com.brave.chockpaler.items.service;

import java.util.List;

import com.brave.chockpaler.items.dto.ItemsDto;

public interface ItemsService {

	public ItemsDto getItemData(int num);
	
	public List<ItemsDto> getItemList();
	
}
