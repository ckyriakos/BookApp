package com.example.werks.services;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.werks.dao.UserMapper;
import com.example.werks.model.User;
import com.example.werks.model.Role;


@Service
public class UserServiceImpl implements UserService, UserDetailsService{
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return userMapper.findByUsername(username).orElseThrow(
                ()-> new UsernameNotFoundException(
                        String.format("USER_NOT_FOUND %s", username)
                ));
	}

	@Override
	public void saveUser(User user) {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String encodedPassword = passwordEncoder.encode(user.getPassword());
		user.setPassword(encodedPassword);
		userMapper.save(user);
	}

	@Override
	public boolean isUserPresent(User user) {
		// TODO Auto-generated method stub
		Optional<User> storedUser = userMapper.findByUsername(user.getUsername());
			return storedUser.isPresent();
	}

	@Override
	public User findById(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
