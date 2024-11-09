package com;
//write java program to print even numbers from array
//write program to print even index values
//6 4 5 9 12
//1 2 3 4  5
//0 1 2 3 4
//even position elements
//o/p: 4 9
//even index
//6 5 12
import java.util.Scanner;

public class ArrayEven {


//even





  public static void main(String[] args) {
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
          if(a[i]%2==0)
          System.out.println(a[i]);
      }
      

  }

}