package com;
import java.util.*;
public class PrimeNo {
	public static void main(String[] args) {
		int num, c=0;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number");
		num = scanner.nextInt();
		
		System.out.println("Factors of "+num);
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				c++;
			}
		}
		if(c==2) {
			System.out.println(num+" is prime number");
		}else {
			System.out.println(num+" is not prime number");
		}
	}
}
