package com;
import java.util.*;
public class Factors {
	public static void main(String[] args) {
		int num;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number");
		num = scanner.nextInt();
		
		System.out.println("Factors of "+num);
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.print(i+" ");
			}
		}
		


	}


}
