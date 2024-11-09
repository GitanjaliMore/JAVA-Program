package com;
import java.util.*;
public class Helloifelse {
int no,no1,no2,no3;//instance variable
Scanner sc= new Scanner(System.in);
//to check positive negative number
void posNeg()
{
	System.out.println("Enter no:");
	no=sc.nextInt();
	if(no>0)
		{
		System.out.println(no+" is a positive number");
		}
	else
	{
		System.out.println(no+" is a negative number");
	
	}
}
//even odd
void evenodd()
{
	System.out.println("Enter no:");
	no=sc.nextInt();
	if(no%2==0)
	{
		System.out.println(no+" is a even number");
	}
	else
	{
		System.out.println(no+" is a odd number");
	}
}

//max no using & operator
void max()
{
	//no1=10 no2=20 no3=30
	System.out.println("Enter no1: ");
	no1=sc.nextInt();
	System.out.println("Enter no2: ");
	no2=sc.nextInt();
	System.out.println("Enter no3: ");
	no3=sc.nextInt();
	if(no1>no2 && no1>no3)
		{
		System.out.println(no1+" is greater");
		}
	else if(no2>no1 && no2>no3)
	{
		System.out.println(no2+" is greater");	
	}
	else
	{
		System.out.println(no3+" is greater");
	}
		}
//swapping
void swap()
{
	System.out.println("Enter no1:");
	no1=sc.nextInt();
	System.out.println("Enter no2: ");
	no2=sc.nextInt();
	int temp=no1;
	no1=no2;
	no2=temp;
	System.out.println("no1 : +no1");
	System.out.println("no2 : +no2");
}
//swap without temp
public static void main (String[] args0) {
	//IfelseDemo demo=new IfelseDemo();
	//demo.posNeg();//tocheck positive negative number
	//demo.evenodd();//even or odd
	
}
}
