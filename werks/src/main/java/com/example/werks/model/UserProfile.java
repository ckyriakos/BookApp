package com.example.werks.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="userProfile")
public class UserProfile {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private  int id;
	
	//mallon pernei apo user file
	@Column(name="username")
	private String username;
	
	@Column(name="full_name")
	private String fullName;
	
	@Column(name="age")
	private int age;
	
//	@ManyToMany(fetch=FetchType.LAZY, cascade = {CascadeType.DETACH, CascadeType.PERSIST,
//			CascadeType.MERGE, CascadeType.REFRESH})
//	@JoinTable(name = "favourites_authors", joinColumns =
//	@JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "author_id")) 
//	
	@ManyToMany(mappedBy="userProfile", cascade = CascadeType.ALL)
	private List<BookAuthor> favouriteBookAuthors;
//	
	@ManyToMany(mappedBy="userProfile", cascade = CascadeType.ALL)
	private List<BookCategory> favouriteBookCategories = new ArrayList<>();
	
	@OneToMany(mappedBy="requestingUsers", cascade = CascadeType.ALL)
	private List<Book> bookOffers = new ArrayList<>();
//	
	@ManyToMany(mappedBy = "requestingUsers", cascade = CascadeType.ALL)
	private List<Book> requestedBooks = new ArrayList<>();
	
	
	public int getId() {
		return id;
	}
	
	public String getUsername() {
		return username;
	}

	public String getfullName() {
		return fullName;
	}
	
	public int getAge() {
		return age;
	}
	
	public List<BookAuthor> getFavouriteBookAuthors() {
		return favouriteBookAuthors;
	}
	
	public List<BookCategory> getFavouriteBookCategories() {
		return favouriteBookCategories;
	}
	
	public List<Book> getBookOffers() {
		return bookOffers;
	}

	public List<Book> getRequestedBooks() {
		return requestedBooks;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public void setfullName(String fullName) {
		this.fullName = fullName;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setFavouriteBookAuthors(List<BookAuthor> favouriteBookAuthors) {
		this.favouriteBookAuthors = favouriteBookAuthors;
	}
	
	public void setFavouriteBookCategories(List<BookCategory> favouriteBookCategories) {
		this.favouriteBookCategories = favouriteBookCategories;
	}

	public void setBookOffers(List<Book> bookOffers) {
		this.bookOffers = bookOffers;
	}

	public void setRequestedBooks(List<Book> requestedBooks) {
		this.requestedBooks = requestedBooks;
	}
	
}
