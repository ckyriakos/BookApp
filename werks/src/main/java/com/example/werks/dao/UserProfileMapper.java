package com.example.werks.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.werks.model.UserProfile;

@Repository
public interface UserProfileMapper extends JpaRepository<UserProfile, String> {

	public Optional<UserProfile> findByUsername(String username);
}
