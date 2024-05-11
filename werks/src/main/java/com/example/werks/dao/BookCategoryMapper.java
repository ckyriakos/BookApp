package com.example.werks.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.werks.model.BookCategory;

@Repository
public interface BookCategoryMapper extends JpaRepository<BookCategory, String> {

	public List<BookCategory> findByName(String name);
}
