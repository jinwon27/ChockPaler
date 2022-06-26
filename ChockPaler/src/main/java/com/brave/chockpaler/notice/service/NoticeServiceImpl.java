package com.brave.chockpaler.notice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brave.chockpaler.notice.dao.NoticeDao;
import com.brave.chockpaler.notice.dto.NoticeDto;
import com.brave.chockpaler.util.reviewPageUtil;

@Service
public class NoticeServiceImpl implements NoticeService{
	
	@Autowired
	NoticeDao dao;
	
	@Override
	public List<NoticeDto> getList(reviewPageUtil pUtil) {
		return dao.getList(pUtil);
	}

	@Override
	public NoticeDto getData(int num) {
		return dao.getData(num);
	}

	@Override
	public int getCount() {
		return dao.getNoticeCout();
	}

	@Override
	public void addNotice(NoticeDto dto) {
		dao.addData(dto);
	}

}
