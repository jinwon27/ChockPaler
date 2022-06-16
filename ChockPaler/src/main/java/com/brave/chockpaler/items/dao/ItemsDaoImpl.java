package com.brave.chockpaler.items.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.brave.chockpaler.items.dto.ItemsDto;

@Repository
public class ItemsDaoImpl implements ItemsDao {

	private SqlSession session;
	
	@Override
	public List<ItemsDto> getList(ItemsDto dto) {
		
		return null;
	}

	@Override
	public void insert(ItemsDto dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int num) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(ItemsDto dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ItemsDto getData(int num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ItemsDto SalCount(int num) {
		// TODO Auto-generated method stub
		return null;
	}

}
