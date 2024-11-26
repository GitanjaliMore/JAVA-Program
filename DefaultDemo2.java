package java8feature;

//Write a program to understand how to refer to a particular default method when the same method is found in two interfaces.

//two interfaces with same default method name
interface One{
   default void message(){
           System.out.println("Hello from one");
  }
}

interface Two{
  default void message(){
           System.out.println("Hello from two");
  }
}

class ImpClass implements One,Two{
  //override the message() method to resolve the confussion
 public void message(){
        Two.super.message(); //this will call Two's message
}
}

public class DefaultDemo2{
   public static void main(String args[]){
              //Create implementation class object
              ImpClass ic=new ImpClass();
            ic.message();
   }
 }

