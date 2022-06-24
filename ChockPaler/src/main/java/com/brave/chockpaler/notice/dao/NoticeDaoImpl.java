package com.brave.chockpaler.notice.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.brave.chockpaler.notice.dto.NoticeDto;
import com.brave.chockpaler.util.reviewPageUtil;

@Repository
public class NoticeDaoImpl implements NoticeDao{

	@Autowired
	SqlSession session;
	
	@Override
	public List<NoticeDto> getList(reviewPageUtil pUtil) {
		return session.selectList("notice.getList", pUtil);
	}

	@Override
	public NoticeDto getData(int num) {
		return session.selectOne("notice.getDto", num);
	}

	@Override
	public int getNoticeCout() {
		return session.selectOne("notice.getNoticeCount");
	}

	@Override
	public void addData(NoticeDto dto) {
		session.insert("notice.addData", dto);
	}

}
