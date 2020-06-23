package com.mvc.kulkkeok.model.dao;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mvc.kulkkeok.model.dto.BestbeerDto;
import com.mvc.kulkkeok.model.dto.RecentReviewDto;

@Repository
public class MainDaoImpl implements MainDao{
	
	Logger logger = LoggerFactory.getLogger(MainDaoImpl.class);
	
	@Autowired
	SqlSessionTemplate sqlSession;
	
	@Override
	public List<BestbeerDto> bestStar() {
		logger.info("[ MainDao : bestStar ]");
		List<BestbeerDto> res = new ArrayList<BestbeerDto>();
		try {
			res = sqlSession.selectList(namespace+"bestStarSql");
		
		} catch (Exception e) {
			logger.info("[ MainDao : error ]");
		}
		
		for(BestbeerDto dto : res) {
			dto.setIntStarAvg((int) dto.getStar_avg());
		}
		
		return res;
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
