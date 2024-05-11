package com.example.werks.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name="bookCategory")
public class BookCategory {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="category_Id")
	private int categoryId;
	
	@Column(name="name")
	private String name;
	
	//mappedBy="bookCategory", na dw ti prosferei an to prosthesw mazi me to fetch
	@OneToMany(fetch=FetchType.LAZY,cascade = CascadeType.ALL)
	private List<Book> books = new ArrayList<>();
	
	@ManyToMany(fetch=FetchType.LAZY,cascade = CascadeType.ALL)
	private List<UserProfile> userProfile = new ArrayList<>();
//	
	public int getCategoryId() {
		return categoryId;
	}
	
	public String getName() {
		return name;
	}
//	
	public List<Book> getBooks() {
		return books;
	}
	
	public List<UserProfile> getUserProfile() {
		return userProfile;
	}
	
	public void setAuthorid(int categoryId) {
		this.categoryId = categoryId;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setUserProfile(List<UserProfile> userProfile) {
		this.userProfile = userProfile;
	}
	
	public void setBooks(List<Book> books) {
		this.books = books;
	}


}
