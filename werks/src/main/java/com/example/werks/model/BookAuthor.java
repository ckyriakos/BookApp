package com.example.werks.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name="bookAuthors")
public class BookAuthor {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="authorid")
	private int authorid;

	@Column(name="name")
	private String name;
	
	@ManyToMany(fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Book> books = new ArrayList<>();
//	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//	@JoinTable(name = "favourites_authors", joinColumns =
//	@JoinColumn(name = "author_id"), inverseJoinColumns = @JoinColumn(name = "user_id")) 
	@ManyToMany(fetch=FetchType.LAZY,cascade = CascadeType.ALL)
	private List<UserProfile> userProfile = new ArrayList<>();
	
	public int getAuthorid() {
		return authorid;
	}
	
	public String getName() {
		return name;
	}
	
	public List<Book> getBooks() {
		return books;
	}
	public List<UserProfile> getUserProfile() {
		return userProfile;
	}
//	
	
	public void setAuthorid(int authorid) {
		this.authorid = authorid;
	}
	
	public void setName(String name) {
		this.name = name;
	}
//	
	public void setUserProfile(List<UserProfile> userProfile) {
		this.userProfile = userProfile;
	}

	
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
}
