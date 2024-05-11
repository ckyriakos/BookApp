package com.example.werks.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.werks.model.User;

@Repository
public interface UserMapper extends JpaRepository<User, String> {

	public Optional<User> findByUsername(String username);
}
