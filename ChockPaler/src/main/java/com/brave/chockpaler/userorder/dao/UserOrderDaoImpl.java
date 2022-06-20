package com.brave.chockpaler.userorder.dao;



import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.brave.chockpaler.userorder.dto.UserOrderDto;

@Repository
public class UserOrderDaoImpl implements UserOrderDao{

	@Autowired
	private SqlSession session;



	@Override
	public void insert(UserOrderDto dto) {
		session.insert("userorder.insert",dto);
		
	}

	@Override
	public List<UserOrderDto> getList(String id) {
		// TODO Auto-generated method stub
		return session.selectList("userorder.listOrder", id);
	}

	@Override
	public void deleteCart(int NUM) {
		session.delete("userorder.delete", NUM);
		
	}

	@Override
	public void deleteAll(String id) {
		session.delete("userorder.deleteall", id);
		
	}

	@Override
	public int countCart(String id, int count) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int sumPrice(String id) {
		
		return session.selectOne("userorder.sumPrice", id);
	}

	@Override
	public void updateCart(UserOrderDto dto) {
		// TODO Auto-generated method stub
		
	}


	
	@Override
	public List<UserOrderDto> cartPrice() {
		
		return null;
	}

	@Override
	public void update(int NUM) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifyCart(UserOrderDto dto) {
		 session.update("userorder.modify", dto);
		
	}
	
	
	



}
