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
	public void addOrder(UserOrderDto dto) {
		session.insert("userorder.addOrder",dto);
		
	}

	@Override
	public List<UserOrderDto> getList(UserOrderDto dto) {
		
		return session.selectList("userorder.getList");
	}

	@Override
	public void delete(UserOrderDto dto) {
		session.delete("userorder.delete", dto);
		
	}

	@Override
	public void getData(UserOrderDto dto) {
		session.update("userorder.getData",dto);
		
	}

	@Override
	public void getPrice(UserOrderDto dto) {
		session.selectOne("userorder.getPrice", dto);
		
	}
	
	

}
