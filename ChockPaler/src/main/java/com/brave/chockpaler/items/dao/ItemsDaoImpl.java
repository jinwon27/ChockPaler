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
	public ItemsDto getData(int num) {
		return session.selectOne("ItemsMapper.getData", num); // 내가 이래뵈도 ItemDto야 
	}
}
