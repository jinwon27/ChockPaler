package com.brave.chockpaler.notice.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.brave.chockpaler.notice.dto.NoticeDto;

@Repository
public class NoticeDaoImpl implements NoticeDao{

	@Autowired
	SqlSession session;
	
	@Override
	public List<NoticeDto> getList() {
		return session.selectList("notice.getList");
	}

	@Override
	public NoticeDto getData(int num) {
		return session.selectOne("notice.getDto", num);
	}

}
