package com.brave.chockpaler.items.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.brave.chockpaler.items.dto.ItemsDto;
import com.brave.chockpaler.util.pageUtil;

@Repository
public class ItemsDaoImpl implements ItemsDao {
	@Autowired
	private SqlSession session;

	@Override
	public ItemsDto getData(int num) {
		return session.selectOne("Items.getData", num); // 내가 이래뵈도 ItemDto야 
	}

	@Override
	public List<ItemsDto> getList(Map<String, Object> map) {
		
		return session.selectList("Items.getList", map);
	}

	@Override
	public int getCount(Map<String, Object> map) {
		return session.selectOne("Items.getItemCount", map);
	}
	
	@Override
	public int getSearchCount(Map<String, Object> map) {
		return session.selectOne("Items.getSearchCount", map);
	}

	@Override
	public void insert(ItemsDto dto) {
		session.insert("Items.insert", dto);

		
	}
	@Override
	public void delete(int num) {
		session.delete("Items.delete", num);
	}

	@Override
	public void setViewCount(int num) {
		session.update("Items.updateViewCount", num);
	}

	@Override
	public List<ItemsDto> getSearchList(Map<String, Object> map) {
		return session.selectList("Items.getSearchList", map);
	}
}
