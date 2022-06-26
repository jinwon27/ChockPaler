package com.brave.chockpaler.review.dao;

import java.util.List;

import com.brave.chockpaler.review.dto.ReviewDto;
import com.brave.chockpaler.util.reviewPageUtil;

public interface ReviewDao {
	public void insertReview(ReviewDto dto);
	
	public List<ReviewDto> selectReview(reviewPageUtil pUtil);
	
	public int getCount();
}
