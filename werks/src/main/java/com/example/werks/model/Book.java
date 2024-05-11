package com.example.werks.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name="book")
public class Book {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="bookid")
	private int bookid;
	
	@Column(name="book_title")
	private String title ;
	
	@ManyToMany(mappedBy = "books", cascade = CascadeType.ALL)
	private List<BookAuthor> bookAuthors = new ArrayList<>();
//	
	@ManyToOne
	@JoinColumn(name="category_id", referencedColumnName="category_Id")
	private BookCategory bookCategory;
	
	@ManyToMany(fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	private List<UserProfile> requestingUsers = new ArrayList<>();
	
	
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
	
	public List<UserProfile> getUserProfile() {
		return requestingUsers;
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
//	
	public void setUserProfile(List<UserProfile> requestingUsers) {
		this.requestingUsers = requestingUsers;
	}

}
