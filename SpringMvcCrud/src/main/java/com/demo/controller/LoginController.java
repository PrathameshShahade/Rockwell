package com.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.User;
import com.demo.service.UserService;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	UserService us;

	@GetMapping("/")
	public String showloginform() {
		return "login";
	}
	
	@PostMapping("/validate")
	public ModelAndView validateUser(@RequestParam String username,@RequestParam String password)
	{
		User u =us.validateUser(username,password);
		if(u==null)
		{
			return new ModelAndView("redirect:/login/");
		}
		
		else {
			return new ModelAndView("redirect:/product/all");
		}
	
	}
	

}
