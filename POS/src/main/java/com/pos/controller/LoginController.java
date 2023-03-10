package com.pos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.pos.entity.Login;
import com.pos.service.ILoginService;

@Controller
public class LoginController {
	
	@Autowired
	ILoginService loginServ;
	
	// Get login form
	@GetMapping("/login/form")
	public String loginForm(Model model) {
		Login login = new Login();
		model.addAttribute("login", login);
		return "login-form";
	}
	
	// Validate user credentials with db credentials
	@PostMapping("/login")
	public String validateLogin(@ModelAttribute("login") Login login) {
		Login lg = loginServ.validateLogin(login);
		if(lg.getRole().equals("admin")) {
			return "redirect:/admin-view";
		} else {
			return "redirect:/index";
		}
	}

}