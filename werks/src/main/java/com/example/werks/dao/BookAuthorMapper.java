package com.example.werks.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.werks.model.BookAuthor;

@Repository
public interface BookAuthorMapper extends JpaRepository<BookAuthor, String> {

	List<BookAuthor> findByName(String name);
}
