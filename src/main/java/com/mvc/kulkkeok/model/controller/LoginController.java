package com.mvc.kulkkeok.model.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mvc.kulkkeok.model.dto.UserDto;
import com.mvc.kulkkeok.model.service.LoginService;

@Controller
public class LoginController {
	Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired
	LoginService ls;
	
	
	@RequestMapping("/loginPage.do")
	public String loginPage() {
		
		return "/login/login";
	}
	
	@RequestMapping("/findIdPage.do")
	public String findIdPage() {
		
		return "/login/findId";
	}	

	@RequestMapping("/findPwPage.do")
	public String findPwPage() {
		
		return "/login/findPwd";
	}	
	
	// login 기능

	@RequestMapping("/login.do")
	@ResponseBody
	public Map<String,Boolean> login(@RequestBody UserDto user,HttpServletRequest request){
		logger.info("[ MainController : login ]");
		logger.info(user.toString());
		Boolean is = false;
		user = ls.login(user);
		
		if(user != null) {
			HttpSession session = request.getSession();
			session.setAttribute("user", user);
			is = true;
		}
		
		Map<String,Boolean> map = new HashMap<String, Boolean>();
		
		map.put("check", is);
		return map;
	}
	
}
