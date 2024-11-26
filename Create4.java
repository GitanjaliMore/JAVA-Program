package java8feature;

//To create a stream of objects using Stream.generate()

import java.util.stream.*;

class Create4{
     public static void main(String args[]){
          //create a stream from random numbers    
 Stream<Double>sm=Stream.generate(()->{return Math.random();});
  //Display the elements of the stream
   sm.forEach(System.out::println);
    }
}

