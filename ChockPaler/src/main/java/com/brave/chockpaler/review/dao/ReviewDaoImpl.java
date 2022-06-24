package com.brave.chockpaler.review.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.brave.chockpaler.review.dto.ReviewDto;
import com.brave.chockpaler.util.reviewPageUtil;

@Repository
public class ReviewDaoImpl implements ReviewDao{

	@Autowired
	SqlSession session;
	
	@Override
	public void insertReview(ReviewDto dto) {
		session.insert("review.insert", dto);
	}

	@Override
	public List<ReviewDto> selectReview(reviewPageUtil pUtil) {
		return session.selectList("review.select", pUtil);
	}

	@Override
	public int getCount() {
		return session.selectOne("review.getCount");
	}

}
