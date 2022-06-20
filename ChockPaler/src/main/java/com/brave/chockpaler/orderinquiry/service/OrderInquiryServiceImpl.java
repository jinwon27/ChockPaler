package com.brave.chockpaler.orderinquiry.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brave.chockpaler.orderinquiry.dao.OrderInquiryDao;
import com.brave.chockpaler.orderinquiry.dto.OrderInquiryDto;

@Service
public class OrderInquiryServiceImpl implements OrderInquiryService{

	@Autowired
	OrderInquiryDao dao;
	
	@Override
	public OrderInquiryDto getDto(String id) {
		return dao.getData(id);
	}
	
}
