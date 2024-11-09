package com;

public class VariableTypes {

	int k;  //instance variables
	float f; //0.0
	char ch; //blank space
	String s; //null
	
	//static variables also known as class variables
	static int p;


	public static void main(String[] args) {
		//1.Local variables: variabes decalred in methods
		//local variables does not have initial values , no garbage value
		//int i; 
		//System.out.println(i);//error
		
		VariableTypes variableTypes = new VariableTypes();
		
		System.out.println(variableTypes.k);;
		System.out.println("String "+variableTypes.s);
		System.out.println("float "+variableTypes.f);
		System.out.println("static variable "+p);
		System.out.println("static variable "+variableTypes.ch);
		System.out.println("static variable "+VariableTypes.p);
	}


}
