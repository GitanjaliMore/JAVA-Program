package com;

import java.util.*;

public class SwitchCase {
	
	public static void main(String[] args)
	{
char ch;
@SuppressWarnings("resource")
Scanner sc= new Scanner(System.in);

System.out.print("********Menu Card********");
System.out.println("a");
System.out.println("e");
System.out.println("i");
System.out.println("o");
System.out.println("u");

System.out.println("Enter your Choice");
ch=sc.next().charAt(0);
switch(ch)
{
case 'a' :
	System.out.println("A for Apple");
	break;
	
case 'e' :
	System.out.println("e for Elephant");
	break;
	
case 'i' :
	System.out.println("i for icecream");
	break;
	
case 'o' :
	System.out.println("o for organization");
	break;
	
case 'u' :
	System.out.println("u for user");
	break;
	
}
}
}



