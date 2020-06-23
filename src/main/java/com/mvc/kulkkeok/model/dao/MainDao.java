package com.mvc.kulkkeok.model.dao;

import java.util.List;

import com.mvc.kulkkeok.model.dto.BestbeerDto;
import com.mvc.kulkkeok.model.dto.RecentReviewDto;

public interface MainDao {
	
	String namespace="mapper.main.";
	
	public List<BestbeerDto> bestStar();
	public List<BestbeerDto> countReview();
	public List<RecentReviewDto> getRecentReviewList();
}
