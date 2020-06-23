package com.mvc.kulkkeok.common.filter;
import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogFilter implements Filter{
	
	private Logger logger = LoggerFactory.getLogger(LogFilter.class);
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		
		
	}

	// Dispatcher 앞에서 처리
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		// 1. request 파라미터를 이용해서 요청의 필터 작업을 수행한다.
		// 2. 만약 다음 필터가 존재할 시, 체인의 다음 필터를 처리한다.
		// chain.doFilter(request,response);
		// 3. response를 이용하여 응답의 필터링 작업을 수행한다.
		
		
		HttpServletRequest req = (HttpServletRequest) request; // 해당 요청을 HttpServletRequest로 형변환.
		String remoteAddr = req.getRemoteAddr(); // ip주소 가져오기.
		String uri = req.getRequestURI(); 
		String url = req.getRequestURL().toString();
		
		String queryString = req.getQueryString();
		
		String referer = req.getHeader("referer");
		String agent = req.getHeader("User-Agent");
		
		logger.info("<< ---START LOG FILTER--- >>"); //filter 가 실행
		logger.info("uri: "+uri+"\n");
		logger.info("url: "+url+"\n");
		logger.info("quertString: "+queryString+"\n");
		logger.info("<< ---END LOG FILTER--- >>"); //filter 가 실행
		chain.doFilter(request, response); 
		//다음에 존재하는 필터가 있으면, 그 필터가 실행될 수 있도록 chaining!
		// request에 들어있는 정보를 읽어서 log.info한 것!
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}

