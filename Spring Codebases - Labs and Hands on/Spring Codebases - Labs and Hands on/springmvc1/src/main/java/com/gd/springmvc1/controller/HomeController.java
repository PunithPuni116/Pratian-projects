package com.gd.springmvc1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	//@RequestMapping(value="/", method = RequestMethod.GET)
	@RequestMapping(value="/")//GET
	public String index() {
		return "index";	
	}
	
	@RequestMapping(value="/index.html")
	public String home() {
		return "index";
	}
	

}
