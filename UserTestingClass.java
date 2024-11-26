package com.edu;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class UserTestingClass {
	
	UserValidate uv = new UserValidate();
	
	@Test
	public void userNameTest() {
		String result =uv.userNameCheck("ADmin");
		assertEquals("admin",result);
	}
	
	@Test
	public void passwordTest() {
		String result = uv.passwordCheck("Admin123");
//		if("Admin123".equals(result))
			assertEquals("Admin123", result);
	}
	
	@Test
	public void userLoginTest() {
		String result = uv.userLogin("Admin", "admin123");
		assertEquals("success", result);
	}


}


