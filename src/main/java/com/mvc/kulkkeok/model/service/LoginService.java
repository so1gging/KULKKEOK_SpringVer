package com.mvc.kulkkeok.model.service;

import com.mvc.kulkkeok.model.dto.UserDto;

public interface LoginService {
	UserDto login(UserDto user);
	String findId(UserDto user);
	String findPw(UserDto user);
}
