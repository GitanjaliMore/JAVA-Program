package com;

import java.util.Scanner;


public class InputData {


	public static void main(String[] args) {
		//declare variables
		int age;
		float salary;
		String name;
		char gen;
		
		//create an object of Scanner
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your name");
		//name = scanner.next(); //reads word
		name = scanner.nextLine();
		
		System.out.println("Enter age");
		age = scanner.nextInt();
		
		System.out.println("Enter salary");
		salary = scanner.nextFloat();
		
		System.out.println("Enter gender");
		gen = scanner.next().charAt(0);
		
		
		//display
		System.out.println("Name="+name);
		System.out.println("Age ="+age);
		System.out.println("Salary ="+salary);
		System.out.println("Gender ="+gen);
		scanner.close();

		
		
}
}