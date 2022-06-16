package com.brave.chockpaler.items.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.brave.chockpaler.items.dto.ItemsDto;

@Repository
public class ItemsDaoImpl implements ItemsDao {
	@Autowired
	private SqlSession session;
	
	@Override
	public List<ItemsDto> getList(ItemsDto dto) {
		
		return null;
	}

	@Override
	public void insert(ItemsDto dto) {
		
		
	}

	@Override
	public void delete(int num) {
		
		
	}

	@Override
	public void update(ItemsDto dto) {
		
		
	}

	@Override
	public ItemsDto getData(int num) {
		
		return null;
	}

	@Override
	public ItemsDto BSCount(int num) {
		
		return null;
	}

}
