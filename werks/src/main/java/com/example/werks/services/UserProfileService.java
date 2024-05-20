package com.example.werks.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.werks.formsdata.BookFormData;
import com.example.werks.formsdata.UserProfileFormData;

@Service
public interface UserProfileService {
	
	// functions
		public UserProfileFormData retrieveProfile(String username);

		public void save(UserProfileFormData userProfileFormData);
		
		public List<BookFormData> retrieveBookOffers(String username);
		
		public void addBookOffer(String username, BookFormData bookFormData);
//		
//		public List<BookFormData> searchBooks(SearchFormData searchFormData);
//		
//		public List<BookFormData> recommendedBooks(String username, RecommendationsFormData recommendationFormData);
		
		public void requestBook(int bookId, String username);
		
		public List<BookFormData> retrieveBookRequests(String username);
		
		public List<UserProfileFormData> retrieveRequestingUsers(int bookId);
		
		public void deleteBookOffer(String username, int bookId);
		
		public void deleteBookRequest(String username, int bookId);

}
