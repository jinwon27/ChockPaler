package com.brave.chockpaler.notice.service;

import java.util.List;

import com.brave.chockpaler.notice.dto.NoticeDto;

public interface NoticeService {
	public List<NoticeDto> getList();
	
	public NoticeDto getData(int num);
}
