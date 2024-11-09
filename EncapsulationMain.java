package com;
import java.util.Scanner;


//Encapsulation : wrapping of member data and member functions inside a class
class FactorialClass{
//instance variable
int num;
double fact;

void inputData() {
@SuppressWarnings("resource")
Scanner scanner = new Scanner(System.in);
System.out.println("Enter number");
num = scanner.nextInt();
}

void calculateFact() {
fact=1;
for(int i=num;i>=1;i--) {
fact = fact*i;
}
System.out.println("Factorial of "+num+" is "+fact);
}

}


public class EncapsulationMain {
	public static void main(String[] args) {
		FactorialClass factorialClass = new FactorialClass();
		factorialClass.inputData();
		factorialClass.calculateFact();


}
}
