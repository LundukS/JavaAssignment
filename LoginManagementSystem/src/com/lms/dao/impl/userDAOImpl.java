package com.lms.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.lms.dao.UserDao;
import com.lms.pojo.User;

public class userDAOImpl implements UserDao {
	Scanner sc = new Scanner(System.in);
	List<User> userList = new ArrayList<>();

	public List<User> getUserList() {
		return userList;
	}

	@Override
	public void register() {
		System.out.println("Welcome! Please enter the following information to register.");
		System.out.println("First Name: ");
		String fname = sc.next();
		System.out.println("Last Name: ");
		String lname = sc.next();
		System.out.println("Email: ");
		String uEmail = sc.next();
		System.out.println("Username: ");
		String uName = sc.next();
		
		//pw check
		boolean pw_check = true;
		String password = "";
		while(pw_check) {
		
		System.out.println("Password: ");
		String pw = sc.next();
		System.out.println("Re-enterPassword: ");
		String pw2 = sc.next();	
		if(pw.equals(pw2)) {
			password = pw;
			pw_check = false;
		}
		else {
			System.out.println("Password does not match.");
		}
		
		}// end of while
		
		
		User u = new User(fname,lname,uEmail,uName,password);
		userList.add(u);
		System.out.println("User registered successfully");
		
		
	}

	@Override
	public boolean verifyUser(String uname, String password) {
		for(User u : userList) {
			System.out.println(u.getUsername());
			if(u.getUsername().equals(uname) && u.getPassWord().equals(password)) {
				return true;
			}
		}
		return false;
	}

}
