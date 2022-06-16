package com.brave.chockpaler.userorder.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.brave.chockpaler.userorder.dto.UserOrderDto;

public class UserOrderDaoImpl implements UserOrderDao{

	@Autowired
	private SqlSession session;
	
	@Override
	public void insert(UserOrderDto dto) {
		session.insert("userorder.insert", dto);
		
	}

	@Override
	public UserOrderDto getData(int num) {
		
		return session.selectOne("userorder.getData", num);
	}

	@Override
	public void delete(int num) {
		session.delete("userorder.delete",num);
		
	}

	@Override
	public List<UserOrderDto> getList(UserOrderDto dto) {
		
		return session.selectList("userorder.getList", dto);
	}

	@Override
	public int getCount(UserOrderDto dto) {
		
		return session.selectOne("userorder.getCount", dto);
	}

}
