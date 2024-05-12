package com.example.werks.services;

import org.springframework.stereotype.Service;

import com.example.werks.model.User;

@Service
public interface UserDetailsService {
	
	public User loadUserByUsername(String username);

}
