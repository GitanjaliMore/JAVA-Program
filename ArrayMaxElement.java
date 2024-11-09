package com;
import java.util.Scanner;

public class ArrayMaxElement {
	


		public static void main(String[] args) {
			//int a[]=new int[5];
			int []a=new int[5];
			int sum=0;
			
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
			
			//find the sum of all array elements
			
			for(int i=0;i<a.length;i++) {
				sum=sum+a[i];
			}
			
			System.out.println("sum of all array elements "+sum);
			//average
			//max elements
			//min element
			
			float average=(float)sum/a.length;
			System.out.println("Average="+average);
			
			//find the maximum
			int max=a[0];
			
			for(int i=1;i<a.length;i++) {
				if(a[i]>max) {
					max=a[i];
				}
			}
			
			System.out.println("Maximum element is "+max);
			//minimum
			//minimum
			//minimum
	      int min=a[0];
			
			for(int i=1;i<a.length;i++) {
				if(a[i]<min) {
					min=a[i];
				}
			}
			
			System.out.println("Minimum element is :"+min);
			
		}

		}


	



