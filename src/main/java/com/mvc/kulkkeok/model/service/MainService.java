package com.mvc.kulkkeok.model.service;

import java.util.List;

import com.mvc.kulkkeok.model.dto.BestbeerDto;
import com.mvc.kulkkeok.model.dto.RecentReviewDto;


public interface MainService {
	
	public List<BestbeerDto> bestStar();
	public List<BestbeerDto> countReview();
	public List<RecentReviewDto> getRecentReviewList();


}
