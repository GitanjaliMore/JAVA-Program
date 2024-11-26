package java8feature;
//Predicate to display numbers greater than 10

import java.util.function.Predicate;
class PrediacteDemo2{
    public static void main(String args[]){
            //take a group of integer objects in an array
           Integer []arr={8,9,10,11,12,13,14,15,16};
        //create Predicate reference to lambda expression
        Predicate<Integer>gt=(i) -> i>10;
      
      System.out.println("Numbers greater than 10 :");
      //call the method and pass predicate reference
       myMethod(gt,arr);
           
   }
   static void myMethod(Predicate<Integer> p, Integer []arr)
   {
           for(Integer i:arr){
                   if(p.test(i)) System.out.println(i+" ");
            }
   }
}

