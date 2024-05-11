package com.example.werks.services;

import org.springframework.stereotype.Service;

import com.example.werks.model.User;

@Service
public interface UserService {
	
	public void saveUser(User user);
	public boolean isUserPresent(User user);
	public User findById(String username);

}
