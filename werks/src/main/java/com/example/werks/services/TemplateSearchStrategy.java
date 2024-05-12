package com.example.werks.services;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.AbstractList;
import java.util.List;
import com.example.werks.dao.BookMapper;
public abstract class TemplateSearchStrategy {

	@Autowired
	public BookMapper bookMapper;
	
	public List<BookFormData> search(SearchFormData searchFormData, BookMapper bookMapper);
	
	public AbstractList<Book> makeInitialListOfBooks(SearchFormData searchFormData); 

	public boolean checkIfAuthorsMatch(SearchFormData searchFormData, Book book);
}
