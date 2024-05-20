package com.example.werks.services;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.werks.dao.*;
import com.example.werks.formsdata.*;
import com.example.werks.model.*;

@Service
public class UserProfileServiceImpl implements UserProfileService {
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Autowired
	private UserProfileMapper userProfileMapper;

	@Autowired
	private BookAuthorMapper bookAuthorMapper;
	
	@Autowired
	private BookCategoryMapper bookCategoryMapper;
	
	@Autowired
	private BookMapper bookMapper;
	
//	@Autowired
//	private SearchFactory searchFactory;
//	
//	@Autowired
//	private RecommendationFactory recommendationFactory;
	
	
	// functions
	@Override
	public UserProfileFormData retrieveProfile(String username) {
		Optional<UserProfile> userProfile = userProfileMapper.findByUsername(username);
		return userProfile.get();
	}

	@Override
	public void save(UserProfileFormData userProfileFormData) {
		userProfileMapper.save(userProfileFormData);
	}
	
	public List<BookFormData> retrieveBookOffers(String username){
		
		UserProfile userProfile = userProfileMapper.findByUsername(username).orElseThrow(
                ()-> new UsernameNotFoundException(
                        String.format("USER_NOT_FOUND %s", username)
                ));
		return userProfile.getBookOffers();
		
	}
	
	@Override
	public void addBookOffer(String username, BookFormData bookFormData) {
		List<BookFormData> retrievedBookOffers = retrieveBookOffers(username);
		retrievedBookOffers.add(bookFormData);
		
	}
	
	public List<BookFormData> searchBooks(SearchFormData searchFormData);
	
	public List<BookFormData> recommendedBooks(String username, RecommendationsFormData recommendationFormData);
	

	@Override
	public void requestBook(int bookId, String username) {
		UserProfile userProfile = userProfileMapper.findByUsername(username).orElseThrow(
                ()-> new UsernameNotFoundException(
                        String.format("USER_NOT_FOUND %s", username)
                ));
		List<Book> requestedBooks = userProfile.getRequestedBooks();
		requestedBooks.add(bookId);
		
	}
	
	public List<BookFormData> retrieveBookRequests(String username) {
		public void requestBook(int bookId, String username) {
			UserProfile userProfile = userProfileMapper.findByUsername(username).orElseThrow(
	                ()-> new UsernameNotFoundException(
	                        String.format("USER_NOT_FOUND %s", username)
	                ));
			userProfile.getRequestedBooks();
		}
	}
	
//	public List<UserProfileFormData> retrieveRequestingUsers(int bookId){}
	
	@Override
	public void deleteBookOffer(String username, int bookId) {
			userProfileMapper.findByUsername(username).orElseThrow(
                ()-> new UsernameNotFoundException(
                        String.format("USER_NOT_FOUND %s", username)
                ));
			bookMapper.deleteById(username);
//			Optional<Book> bookToBeDeleted = bookMapper.findById(bookId);
//			bookMapper.
//			if(bookToBeDeleted.isPresent())
//				Book.delete(bookToBeDeleted.get());
//			else
//				return "Book Not available in database!";
//			
//			return "Book Deleted Successfully!";
	}
	
	@Override
	public void deleteBookRequest(String username, int bookId) {}


}
