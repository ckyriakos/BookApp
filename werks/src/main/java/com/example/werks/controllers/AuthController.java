package com.example.werks.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.werks.model.User;
import com.example.werks.services.UserService;





@Controller
@RequestMapping("/")
public class AuthController {
	
	@Autowired
    UserService userService;
	
	@RequestMapping("/signin")
	public String sayHello(Model model) {
			
			model.addAttribute("message", "Sign in page!");
			 
			return "signin";
		}
	
	@RequestMapping("/signup")
	public String signupPage(Model model) {
			
			model.addAttribute("message", "This is the sign up page!");
			model.addAttribute("user", new User());
			 
			return "signup";
		}

	@RequestMapping("/save")
    public String registerUser(@ModelAttribute("user") User user, Model model){
		
		userService.saveUser(user);
		
		model.addAttribute("successMessage", "User registered successfully!");
		
		return "signin";
	
	}
       
}
