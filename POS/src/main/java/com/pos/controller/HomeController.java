package com.pos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/home/all")
	public String home() {
		return "home";
	}
	@RequestMapping("/viewpizzastores")
	public String home1() {
		return "viewpizzastores";
	}
	@GetMapping("/index")
	public String home2()
	{
		return "index";
	}


}