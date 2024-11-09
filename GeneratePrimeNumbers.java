package com;

public class GeneratePrimeNumbers {
	public static void main(String[] args) {
		//1 to 100
		int c=0,cnt=0;
		for(int num=100;num>=1;num--) {
			c=0;
			for(int i=1;i<=num;i++) {
				if(num%i==0) {
					c++;
				}
			}
			if(c==2) {
		    
				System.out.print(num+" ");
				cnt++;
				if(cnt==5) {
					break;
				}
			}
		}
	}



}
