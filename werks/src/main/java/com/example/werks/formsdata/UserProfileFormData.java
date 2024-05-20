package com.example.werks.formsdata;

import com.example.werks.model.UserProfile;

public class UserProfileFormData {
	private int id;
	private String fullName;
	private String username;
	private int age;
		
	public UserProfileFormData() {
	}

	public UserProfileFormData(UserProfile userProfile) {
		this.id = userProfile.getId();
		this.fullName = userProfile.getfullName();
		this.username = userProfile.getUsername();
		this.age = userProfile.getAge();
	}
	public UserProfileFormData(String fullName, String username, int id, int age) {
		this.id = id;
		this.fullName = fullName;
		this.username = username;
		this.age = age;
	}

	public UserProfileFormData(UserProfileFormData userProfileFormData) {
		this.id = userProfileFormData.id;
		this.fullName = userProfileFormData.fullName;
		this.username = userProfileFormData.username;
		this.age = userProfileFormData.age;
	}

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
//	@Override
//	public String toString() {
//		return "CustomerData [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", mobile="
//				+ mobile + ", username=" + username + ", role=" + role + ", address=" + address + ", password="
//				+ password + ", confirmPassword=" + confirmPassword + "]";
//	}
//	
	
}