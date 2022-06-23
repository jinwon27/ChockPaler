package com.brave.chockpaler.basket.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.brave.chockpaler.basket.dto.basketDto;

@Repository
public class basketDaoImpl implements basketDao{

	@Autowired
	private SqlSession session;	
	
	@Override
	public void insert(basketDto dto) {
		session.insert("basket.insert", dto);
		
	}
	
	@Override
	public List<basketDto> getList() {
	
		return null;
	}



}
