package com.lms.UserClient;

import java.util.Scanner;

import com.lms.dao.impl.userDAOImpl;
import com.lms.pojo.User;

public class userClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		userDAOImpl daoImpl = new userDAOImpl();
		while(true) {
		System.out.println("=======================================================");
		System.out.println("			1. Register                                ");
		System.out.println("			2. Login                                ");
		System.out.println("			3. Exit                                ");
		System.out.println("=======================================================");
		System.out.println("     		Enter 1 or 2 or 3                      ");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			daoImpl.register();
			break;
		case 2:
			System.out.println("Enter username: ");
			String uName = sc.next();
			System.out.println("Enter password: ");
			String pWord = sc.next();
			for (User u : daoImpl.getUserList()) {
				System.out.println(u.getFirstName());
				System.out.println(u.getLastName());
				System.out.println(u.getuEmail());
				System.out.println(u.getUsername());
				System.out.println(u.getPassWord());
			
		}
			
			if (daoImpl.getUserList().size() != 0) 
			{
				for (User u : daoImpl.getUserList()) {
					if (daoImpl.verifyUser(uName, pWord)) {
						System.out.println("Login Successfull.");
					}
				
			}
			}
			else {
				System.out.println("No Users registered.");
			}
			break;
		case 3:
			System.out.println("Thanks for using the application !!!");
			System.exit(0);
			
			break;
		default:
			System.out.println("Enter 1 or 2 or 3.");
		}

		}
	}

}
