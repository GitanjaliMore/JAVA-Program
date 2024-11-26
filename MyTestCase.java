package com.edu;


import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class MyTestCase {


	Calculator obj = new Calculator();
	
	@BeforeClass
	public static void m3() {
		System.out.println("Before all method execution");
	}
	
	@AfterClass
	public static void m4() {
		System.out.println("After all method execution");
	}
	
	@Before
	public void m1() {
		System.out.println("before each method");
	}
	
	@After
	public void m2() {
		System.out.println("After each method");
	}
	
	@Test
	public void addTest() {
		//fail("Not yet implemented");
				int i=10;
				int j=6;
				int s;
				s=i+j;
		assertEquals(16, s);
	}
	
	@Test
	public void subTest() {
		int result = obj.subtract(8, 2);
		assertEquals(6, result);
	}


	
}
