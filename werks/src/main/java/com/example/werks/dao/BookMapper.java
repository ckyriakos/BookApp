package com.example.werks.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.werks.model.Book;

@Repository
public interface BookMapper extends JpaRepository<Book, String> {

	public List<Book> findByTitle(String title);
	public List<Book> findByTitleContaining(String title);
	
	//extra
	public Optional<Book> findById(int bookId);
}
