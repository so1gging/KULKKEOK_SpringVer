package com.mvc.kulkkeok.model.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mvc.kulkkeok.model.dto.UserDto;

@Repository
public class LoginDaoImpl implements LoginDao{
	Logger logger = LoggerFactory.getLogger(LoginDaoImpl.class);
	
	@Autowired
	SqlSessionTemplate sqlSession;
	
	@Override
	public UserDto login(UserDto user) {
		logger.info("[ LoginDao : login ]");
	
		try {
			user = sqlSession.selectOne(NAMESPACE+"loginSql",user);
			
		}catch (Exception e) {
			logger.info("[ LoginDao : error ]");
		}
		return user;
	}

	@Override
	public String findId(UserDto user) {
		logger.info("[ LoginDao : findId ]");
		String user_id = "";
		try {
			user_id = sqlSession.selectOne(NAMESPACE+"findIdSql",user);
			
		}catch (Exception e) {
			logger.info("[ LoginDao : error ]");
		}
		return user_id;
	}

	@Override
	public String findPw(UserDto user) {
		logger.info("[ LoginDao : findPw ]");
		String pw="";
		try {
			user = sqlSession.selectOne(NAMESPACE+"findPwSql",user);
			
		}catch (Exception e) {
			logger.info("[ LoginDao : error ]");
		}
		return pw;
	}

}
