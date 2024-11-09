package com;

public class BubbleSort {





	public static void main(String[] args) {
		int a[]= {4,6,7,2,8,19};
//		Arrays.sort(a);
//		for(int i=0;i<a.length;i++) {
//			System.out.println(a[i]);
//		}
//		System.out.println("Second Largest element "+a[a.length-2]);


	//Bubble sort 
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}	
			}
		}
		
		System.out.println("Sorted elements are :");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		
	
	}


}

