package com;

import java.util.Scanner;


public class BinarySearch {


	public static void main(String[] args) {
		int []a=new int[5];
		
		
		//Input array elements
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter array elements in Ascending sort");
		
		for(int i=0;i<a.length;i++) {
			a[i]=scanner.nextInt();
		}
		
		System.out.println("Enter search element");
		int key = scanner.nextInt();
		
		int low=0;
		int high=a.length-1;
		int mid,pos=0;
		
		while(low<=high) {
			mid=(low+high)/2;
			
			if(key==a[mid]) {
				pos=mid;
				break;
			}else if(key>a[mid]) {
				low = mid+1;
			}else if(key<a[mid]) {
				high = mid-1;
			}
		}
		if(pos>0) {
			System.out.println("Successful search");
			System.out.println(key+" found at position "+(pos+1));
		}else {
			System.out.println("Unsuccessful search");
			System.out.println(key+" not found");
		}
		
	}


}