package com.mvc.kulkkeok.model.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mvc.kulkkeok.model.dto.BestbeerDto;
import com.mvc.kulkkeok.model.dto.RecentReviewDto;
import com.mvc.kulkkeok.model.dto.UserDto;
import com.mvc.kulkkeok.model.service.MainService;

@Controller
public class MainController {
	Logger logger = LoggerFactory.getLogger(MainController.class);
	
	@Autowired
	MainService ms;
	
	
	// Index Page
	@RequestMapping("/index.do")
	public String startIndexPage() {
		logger.info("[ MainController : startIndexPage ]");
		return "index";
	}
	
	// Index faild Page
	@RequestMapping("/index_failed.do")
	public String indexFailedPage() {
		logger.info("[ MainController : indexFailedPage ]");
		return "index_failed";
	}
	
	// Main Page
	@RequestMapping("main.do")
	public String mainPage(Model model) {
		logger.info("[ MainController : mainPage ]");
		List<BestbeerDto> bestStar = ms.bestStar();
		List<BestbeerDto> countReview = ms.countReview();
		List<RecentReviewDto> review = ms.getRecentReviewList();
		
		model.addAttribute("bestStar", bestStar);
		model.addAttribute("review", review);
		model.addAttribute("countReviews", countReview);
		
		return "main";
	}
	

	
}
