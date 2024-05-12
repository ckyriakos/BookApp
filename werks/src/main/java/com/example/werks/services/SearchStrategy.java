package com.example.werks.services;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import com.example.werks.dao.BookMapper;

@Service
public interface SearchStrategy {
	
	public ArrayList<BookFormaData> search(SearchFormaData bookFormData, BookMapper bookMapper);

}
