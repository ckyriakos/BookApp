package com.example.werks.model;

public class UserProfileFormData {

	private String firstName;
	private String lastName;
	private String email;
	private long mobile;
	private String username;
	private String role;
	private String address;
	private String password;
	private String confirmPassword;
		
	public UserProfileFormData() {
	}

	public UserProfileFormData(UserProfile userProfile) {
		this.firstName = userProfile.getFirstName();
		this.lastName = userProfile.getLastName();
		this.email = userProfile.getEmail();
		this.mobile = userProfile.getMobile();
		this.username = userProfile.getUsername();
		this.password = userProfile.getUser().getPassword();
		this.confirmPassword = password;
		this.address = userProfile.getAddress();
		this.role = "ROLE_CUSTOMER";
	}
	public UserProfileFormData(String firstName, String lastName, String email, long mobile, String username, String role,
			String address, String password, String confirmPassword) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobile = mobile;
		this.username = username;
		this.role = role;
		this.address = address;
		this.password = password;
		this.confirmPassword = confirmPassword;
	}

	public UserProfileFormData(UserProfileFormData userProfileFormData) {
		this.firstName = userProfileFormData.firstName;
		this.lastName = userProfileFormData.lastName;
		this.email = userProfileFormData.email;
		this.mobile = userProfileFormData.mobile;
		this.username = userProfileFormData.username;
		this.role = userProfileFormData.role;
		this.address = userProfileFormData.address;
		this.password = userProfileFormData.password;
		this.confirmPassword = userProfileFormData.confirmPassword;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	@Override
	public String toString() {
		return "CustomerData [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", mobile="
				+ mobile + ", username=" + username + ", role=" + role + ", address=" + address + ", password="
				+ password + ", confirmPassword=" + confirmPassword + "]";
	}
	
	
}