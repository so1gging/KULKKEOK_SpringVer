package com.mvc.kulkkeok.model.dao;

import com.mvc.kulkkeok.model.dto.UserDto;

public interface LoginDao {
	String NAMESPACE = "mapper.login.";
	
	UserDto login(UserDto user);
	String findId(UserDto user);
	String findPw(UserDto user);
}
