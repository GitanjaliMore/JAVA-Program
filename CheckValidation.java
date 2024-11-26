package com.validate;


public class CheckValidation {
public String validation(String username, String password) {
if(username.equals("admin") && password.equals("admin@123")) {
	System.out.println("Login successfully!!");
    return "success";
}
else {
    System.out.println("Login failed!!");
}
return "failed";
} 
}
