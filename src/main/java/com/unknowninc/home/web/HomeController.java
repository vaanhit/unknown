package com.unknowninc.home.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping(value = "/home/{testid}", method = RequestMethod.GET)
	public String homePage(HttpServletRequest request, HttpServletResponse response,
			@PathVariable(value="testid") String testid) {
		System.out.println("testing-" + testid);
		return "home/home";
	}
	
	@RequestMapping(value = "/error", method = RequestMethod.GET)
	public String errorPage(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("testing error page");
		return "common/error";
	}
	
}
