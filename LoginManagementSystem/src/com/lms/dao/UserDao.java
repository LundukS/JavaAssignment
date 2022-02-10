package com.lms.dao;

//import com.lms.pojo.User;

public interface UserDao {
	void register();
	boolean verifyUser(String uname, String password);
}
