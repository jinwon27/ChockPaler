package com.brave.chockpaler.notice.dao;

import java.util.List;

import com.brave.chockpaler.notice.dto.NoticeDto;

public interface NoticeDao {
	public List<NoticeDto> getList();
	
	public NoticeDto getData(int num);
}
