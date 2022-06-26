package com.brave.chockpaler.notice.service;

import java.util.List;

import com.brave.chockpaler.notice.dto.NoticeDto;
import com.brave.chockpaler.util.reviewPageUtil;

public interface NoticeService {
	public List<NoticeDto> getList(reviewPageUtil pUtil);
	
	public NoticeDto getData(int num);
	
	public int getCount();
	
	public void addNotice(NoticeDto dto);
}
