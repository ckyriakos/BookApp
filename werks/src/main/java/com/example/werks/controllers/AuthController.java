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
			
			// Here we add data to theModel that will be used by spring to 
			// generate the result html page for the client  
			model.addAttribute("message", "Sign in page!");
			
			// Here we say to spring that this is the name of 
			// the html page template that should be used to generate
			// the result page for the client based on the data put in theModel object  
			return "signin";
		}
	
	@RequestMapping("/signup")
	public String signupPage(Model model) {
			
			// Here we add data to theModel that will be used by spring to 
			// generate the result html page for the client  
			model.addAttribute("message", "This is the sign up page!");
			model.addAttribute("user", new User());
			
			// Here we say to spring that this is the name of 
			// the html page template that should be used to generate
			// the result page for the client based on the data put in theModel object  
			return "signup";
		}

	@RequestMapping("/save")
    public String registerUser(@ModelAttribute("user") User user, Model model){
		
		userService.saveUser(user);
		
		model.addAttribute("successMessage", "User registered successfully!");
		
		return "signin";
	
	}
       
}
