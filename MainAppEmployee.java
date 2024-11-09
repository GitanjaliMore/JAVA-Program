package com;


import java.util.Scanner;


class Employee{
	 //instance variable
	  String name;
	  int age;
	  float salary;
	  String Emailid;
	  String phone;


	   void inputData(){ //member methods
	       @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
	       System.out.println("Enter name");
	       name = scanner.next();
	       System.out.println("Enter age ");
	       age = scanner.nextInt();
	       System.out.println("Enter salary");
	       salary = scanner.nextInt();
	       System.out.println("Enter Emailid");
	       Emailid = scanner.next();
	       System.out.println("Enter phone");
	       phone = scanner.next();
	         
	   }


	  void displayData(){
	      System.out.println("Name = "+name);
	      System.out.println("Age = "+age);
	      System.out.println("salary = "+salary);
	      System.out.println("Emailid = "+Emailid);
	      System.out.println( "phone= "+phone);
	  }


	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + ", Emailid=" + Emailid + ", phone="
				+ phone + "]";
	}


	}



public class MainAppEmployee {


	public static void main(String[] args) {
		//System.out.println("Main method");
		
		Employee employee = new Employee();
		Employee employee1 = new Employee();
		System.out.println(employee);
		System.out.println(employee1);
		System.out.println(employee.name);
		System.out.println(employee.age);
		System.out.println(employee.salary);
		//System.out.println(employee.Emailid);
		//System.out.println(employee.phone);
		
		employee.inputData();
		employee.displayData();
		employee1.inputData();
		employee1.displayData();
		


	}


}



