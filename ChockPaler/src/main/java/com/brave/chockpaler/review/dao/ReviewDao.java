package com.brave.chockpaler.review.dao;

import java.util.List;

import com.brave.chockpaler.review.dto.ReviewDto;

public interface ReviewDao {
	public void insertReview(ReviewDto dto);
	
	public List<ReviewDto> selectReview();
}
