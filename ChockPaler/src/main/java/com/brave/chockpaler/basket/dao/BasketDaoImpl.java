package com.brave.chockpaler.basket.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.brave.chockpaler.basket.dto.BasketDto;

@Repository
public class BasketDaoImpl implements BasketDao{

	@Autowired
	private SqlSession session;	
	
	@Override
	public void insert(BasketDto dto) {
		session.insert("basket.insert", dto);
		
	}
	
	@Override
	public List<BasketDto> getList(String id) {
		List<BasketDto> list = session.selectList("basket.getList", id);
		return list;
	}

	@Override
	public BasketDto getData(int item_num) {
		BasketDto dto = session.selectOne("basket.getData", item_num);
		return dto;
	}

	@Override
	public void update(BasketDto dto) {
		session.update("basket.update", dto);
		
	}

	@Override
	public void delete(int item_num) {
		session.delete("basket.delete", item_num);
		
	}



}
