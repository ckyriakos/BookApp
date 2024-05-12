package com.example.werks.services;

import java.util.AbstractList;
import com.example.werks.model.*;

public class ApproximateSearchStrategy {

	public AbstractList<Book> makeInitialListOfBooks(SearchFormData searchDto);

	public boolean checkIfAuthorsMatch(SearchFormData searchFormData, Book book);
}
