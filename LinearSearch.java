package com;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		int []a=new int[5];
		int sum =0;
		
		//Input array elements
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter array elements");
		
		for(int i=0;i<a.length;i++) {
			a[i]=scanner.nextInt();
		}
		
		//display array elements
		for(int i=0;i<a.length;i++) {
			
			System.out.println(a[i]);
		}
		
		System.out.println("Enter Search element");
		int key = scanner.nextInt();
		int pos=0;
		for(int i=0;i<a.length;i++) {
			if(key == a[i]) {
				pos=i+1;
				break;
			}
		}
		if(pos>0) {
			System.out.println("Successful search ");
			System.out.println("Element found at position "+pos);
		}else {
			System.out.println("Unsuccessful search");
		}
		


	}


}
