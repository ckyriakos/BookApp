package com.example.werks.model;


public class BookFormData {

	private String firstName;
	private String lastName;
	private String email;
	private long mobile;
	private String username;
	private String role;
	private String address;
	private String password;
	private String confirmPassword;
		
	public BookFormData() {
	}

	public BookFormData(Book book) {
		this.firstName = book.getFirstName();
		this.lastName = book.getLastName();
		this.email = book.getEmail();
		this.mobile = book.getMobile();
		this.username = book.getUsername();
		this.password = book.getUser().getPassword();
		this.confirmPassword = password;
		this.address = book.getAddress();
		this.role = "ROLE_CUSTOMER";
	}
	public BookFormData(String firstName, String lastName, String email, long mobile, String username, String role,
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

	public BookFormData(BookFormData bookFormData) {
		this.firstName = bookFormData.firstName;
		this.lastName = bookFormData.lastName;
		this.email = bookFormData.email;
		this.mobile = bookFormData.mobile;
		this.username = bookFormData.username;
		this.role = bookFormData.role;
		this.address = bookFormData.address;
		this.password = bookFormData.password;
		this.confirmPassword = bookFormData.confirmPassword;
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
