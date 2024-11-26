package java8feature;
//Write a program to understand how to create stream of objects using stream.of() method.

//To create stream of objects using stream.of()
import java.util.stream.Stream;

class Create3{
   public static void main(String args[]){
            //Create a stream of Integer objects using stream.of() method
            Stream<Integer>sm1=Stream.of(10,11,12,13,14,15);

            //display the elements of the stream

          sm1.forEach(System.out::println);
          
             //Create another stream of array of Float objects
            Float arr[]={1.2f,7.3f,5.6f,3.2f,9.1f};
             
              Stream<Float> sm2=Stream.of(arr);
         
             //Display the elements of the stream

             sm2.forEach(System.out::println);
   }
}
