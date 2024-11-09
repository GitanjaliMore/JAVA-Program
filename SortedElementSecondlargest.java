package com;

import java.util.Arrays;

public class SortedElementSecondlargest {
	public static void main(String[] args) {
		int a[]= {4,6,7,2,8,19};
		Arrays.sort(a);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.println("Second Largest element "+a[a.length-2]);


	}


}

