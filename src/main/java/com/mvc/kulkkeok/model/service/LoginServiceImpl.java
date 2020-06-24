package com.mvc.kulkkeok.model.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.kulkkeok.model.dao.LoginDao;
import com.mvc.kulkkeok.model.dto.UserDto;

@Service
public class LoginServiceImpl implements LoginService{
	
	Logger logger = LoggerFactory.getLogger(LoginServiceImpl.class);
	
	@Autowired
	LoginDao dao;
	
	@Override
	public UserDto login(UserDto user) {
		logger.info("[ LoginService : login ]");
		return dao.login(user);
	}

	@Override
	public String findId(UserDto user) {
		logger.info("[ LoginService : findId ]");
		return dao.findId(user);
	}

	@Override
	public String findPw(UserDto user) {
		logger.info("[ LoginService : findPw ]");
		return dao.findPw(user);
	}
	

}
