package com;

public class TrianglePattern1 {
	public static void main(String[] args) {
		int r=3;
		
		for(int i=1;i<=r;i++) {
			for(int b=1;b<=r-i;b++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
				}
			System.out.println();
		}
		
		int r1 = 2;
		
		for(int i=1;i<=r1;i++) {
			for(int b=1;b<=r1-i;b++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		int r2 = 4;
		
		for(int i=1 ; i<=r2;i++) {
			for(int b=1;b<=r2-i;b++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}


	}

}