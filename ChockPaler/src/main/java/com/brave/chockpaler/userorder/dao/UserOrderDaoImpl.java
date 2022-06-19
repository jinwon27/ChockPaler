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
	public List<UserOrderDto> getList(String id) {
		
		return session.selectList("userorder.getList", id);
	}

	@Override
	public int addCart(UserOrderDto dto) {
		
		return session.insert("userorder.insert", dto);
	}

	@Override
	public int deleteCart(int num) {
		
		return session.delete("userorder.delete", num);
	}

	@Override
	public int countCart(UserOrderDto dto) {
		
		return session.selectOne("userorder.count", dto);
	}

	
	



}
