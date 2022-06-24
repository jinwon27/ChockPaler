package com.brave.chockpaler.notice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brave.chockpaler.notice.dao.NoticeDao;
import com.brave.chockpaler.notice.dto.NoticeDto;

@Service
public class NoticeServiceImpl implements NoticeService{
	
	@Autowired
	NoticeDao dao;
	
	@Override
	public List<NoticeDto> getList() {
		return dao.getList();
	}

	@Override
	public NoticeDto getData(int num) {
		return dao.getData(num);
	}

}
