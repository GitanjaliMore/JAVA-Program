package com;


import java.util.Scanner;

class Students{
	 //instance variable
	  String name;
	  int age;
	  float fees;
	  char gen;
	  int marks;


	   void inputData(){ //member methods
	       @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
	       System.out.println("Enter name");
	       name = scanner.next();
	       System.out.println("Enter age ");
	       age = scanner.nextInt();
	       System.out.println("Enter gender");
	       gen = scanner.next().charAt(0);
	       System.out.println("Enter fees");
	       fees = scanner.nextFloat();
	       System.out.println("Enter total marks");
	       marks = scanner.nextInt();
	         
	   }


	  void displayData(){
	      System.out.println("Name = "+name);
	      System.out.println("Age = "+age);
	      System.out.println("Fees = "+fees);
	      System.out.println("gender = "+gen);
	      System.out.println( "Marks= "+marks);
	  }


	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", fees=" + fees + ", gen=" + gen + ", marks=" + marks + "]";
	}


	
	  


	}




public class MainAppStudent {


	public static void main(String[] args) {
		System.out.println("Main method");
		
		Students students = new Students();
		Students student1 = new Students();
		System.out.println(students);
		System.out.println(student1);
		System.out.println(students.name);
		System.out.println(students.age);
		System.out.println(students.fees);
		
		students.inputData();
		students.displayData();
		student1.inputData();
		student1.displayData();
		


	}


}

