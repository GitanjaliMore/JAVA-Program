package com;

public class TrianglePattern {
public static void main(String[] args) {
		
		int r=4, c=4;
		
		for(int i=1;i<=r;i++) {
			for(int b=1;b<=r-i;b++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}



}
