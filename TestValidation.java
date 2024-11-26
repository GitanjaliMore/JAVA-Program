package com.validate;



import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestValidation {
CheckValidation obj = new CheckValidation();
//	
	@Test
	public void check() {
		String result = obj.validation("admin", "admin@123");
		assertEquals("success",result);
	}

}
