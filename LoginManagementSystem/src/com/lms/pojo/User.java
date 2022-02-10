package com.lms.pojo;

public class User {
	private String firstName;
	private String lastName;
	private String uEmail;
	private String username;
	private String passWord;
	
	
	public User(String firstName, String lastName, String uEmail, String username, String passWord) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.uEmail = uEmail;
		this.username = username;
		this.passWord = passWord;
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
	public String getuEmail() {
		return uEmail;
	}
	public void setuEmail(String uEmail) {
		this.uEmail = uEmail;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
}
