package com.brave.chockpaler.orderinquiry.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.brave.chockpaler.orderinquiry.dto.OrderInquiryDto;

@Repository
public class OrderInquiryDaoImpl implements OrderInquiryDao{

	@Autowired
	SqlSession session;
	
	@Override
	public OrderInquiryDto getData(String id) {
		
		return session.selectOne("OrderInquiry.getData", id);
	}

}
