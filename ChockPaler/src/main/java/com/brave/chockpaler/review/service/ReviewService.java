package com.brave.chockpaler.review.service;

import java.util.List;

import com.brave.chockpaler.review.dto.ReviewDto;
import com.brave.chockpaler.util.reviewPageUtil;

public interface ReviewService {
	public void addReview(ReviewDto dto);
	
	public List<ReviewDto> getReviews(reviewPageUtil pUtil); 
	
	public int getReviewCount();
}
