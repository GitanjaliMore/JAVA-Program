package java8feature;

//write a program to understand how to use default methods of an interface

//an interface with a default method

interface MyInter{
  int add(int x, int y);  //this method is abstract

 default int mult(int x, int y) //this method is default method
 {
          return (x*y);
  }
}

class MyClass1 implements MyInter{
  public int add(int x, int y){
               return (x+y);
 }
}

public class DefaultDemo1{
    public static void main(String args[]){
 //Interface reference can refer to object of its implementation classes
            MyInter mi=new MyClass1();
           System.out.println("sum="+mi.add(9,8));
         //default method is by default available in implementation class
          System.out.println("Product="+mi.mult(7,6));
           
   }
}
