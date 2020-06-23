package com.mvc.kulkkeok.model.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.kulkkeok.model.dao.MainDao;
import com.mvc.kulkkeok.model.dto.BestbeerDto;
import com.mvc.kulkkeok.model.dto.RecentReviewDto;

@Service
public class MainServiceImpl implements MainService{

	Logger logger = LoggerFactory.getLogger(MainServiceImpl.class);
	
	@Autowired
	MainDao dao;
	
	@Override
	public List<BestbeerDto> bestStar() {
		logger.info("[ MainService : bestStar ]");
		return dao.bestStar();
	}

	@Override
	public List<BestbeerDto> countReview() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RecentReviewDto> getRecentReviewList() {
		// TODO Auto-generated method stub
		return null;
	}

}
