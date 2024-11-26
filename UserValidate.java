package com.edu;

public class UserValidate {


	public String userNameCheck(String username) {
		
		return username.toLowerCase() ;
	}
	
	public String passwordCheck(String password) {
		return password;
	}
	
	public String userLogin(String username,String password) {
		if(username.toLowerCase().equals("admin") && password.equals("admin123")) {
			return "success";
		}
		return "fail";
		
	}
}

