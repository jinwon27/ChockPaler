package com.brave.chockpaler.review.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brave.chockpaler.review.dao.ReviewDao;
import com.brave.chockpaler.review.dto.ReviewDto;

@Service
public class ReviewServiceImpl implements ReviewService{

	@Autowired
	ReviewDao dao;
	
	@Override
	public void addReview(ReviewDto dto) {
		dao.insertReview(dto);
	}

	@Override
	public List<ReviewDto> getReviews() {
		return dao.selectReview();
	}

}
