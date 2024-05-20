package com.example.werks.formsdata;

import com.example.werks.model.*;
import java.util.*;
public class BookFormData {

	private int bookid;
	private String title;
	private List<BookAuthor> bookAuthors;
	private BookCategory bookCategory;

	public BookFormData() {
	}

	public BookFormData(Book book) {
		this.bookid = book.getBookid();
		this.title = book.getTitle();
		this.bookAuthors = book.getBookAuthor();
		this.bookCategory = book.getBookCategory();
	}
	public BookFormData(int bookid, String title,List<BookAuthor>bookAuthors, BookCategory bookCategory) {
		this.bookid = bookid;
		this.title = title;
		this.bookAuthors = bookAuthors;
		this.bookCategory = bookCategory;
	}

	public BookFormData(BookFormData bookFormData) {
		this.bookid = bookFormData.bookid;
		this.title = bookFormData.title;
		this.bookAuthors = bookFormData.bookAuthors;
		this.bookCategory = bookFormData.bookCategory;
	}

	public int getBookid() {
		return bookid;
	}
	
	public String getTitle() {
		return title;
	}
	
	public BookCategory getBookCategory() {
		return bookCategory;
	}
	
	public List<BookAuthor> getBookAuthor() {
		return bookAuthors;
	}
	
//	
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setBookCategory(BookCategory bookCategory) {
		this.bookCategory = bookCategory;
	}
	
	public void setBookAuthor(List<BookAuthor> bookAuthors) {
		this.bookAuthors = bookAuthors;
	}


//	@Override
//	public String toString() {
//		return "CustomerData [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", mobile="
//				+ mobile + ", username=" + username + ", role=" + role + ", address=" + address + ", password="
//				+ password + ", confirmPassword=" + confirmPassword + "]";
//	}
	
	
}
