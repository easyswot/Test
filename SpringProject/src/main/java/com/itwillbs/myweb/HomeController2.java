package com.itwillbs.myweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController2 {
	
	@RequestMapping(value = "/home2", method = RequestMethod.GET)
	public String home2() {
		
		return "home2";
	}
	
	@RequestMapping(value = "/home3", method = RequestMethod.GET)
	public String home3() {
		
		return "home3";
	}
	
}
