package com.brave.chockpaler.notice.dao;

import java.util.List;

import com.brave.chockpaler.notice.dto.NoticeDto;
import com.brave.chockpaler.util.reviewPageUtil;

public interface NoticeDao {
	public List<NoticeDto> getList(reviewPageUtil pUtil);
	
	public NoticeDto getData(int num);
	
	public int getNoticeCout();
	
	public void addData(NoticeDto dto);
}
