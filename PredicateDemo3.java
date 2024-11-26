package java8feature;

//Predicate to display all numbers and even numbers 
import java.util.function.Predicate;
class PredicateDemo3{
  public static void main(String args[]){
         //take a group of integer objects in an array
         Integer []arr={8,9,10,11,12,13,14,15,16};
     
          //create a Predicate references
          Predicate<Integer>all, evens,odd;

          //lambda expression to return true upon taking a number
         all=(n)->true;
         odd=(n)->n%2!=0;
        //lambda expression to return true if it is even number
          evens =(n)->n%2==0;
        System.out.println("\n All numbers:");
           display(all,arr);
         System.out.println("\n All Even numbers:");
         
           display(evens,arr);  
     System.out.println("\n All odd numbers:");
         
           display(odd,arr);  
  }
  static void display(Predicate<Integer> p, Integer []arr){
            for(Integer i:arr){
               if(p.test(i)) System.out.println(i+" ");
             }
     }
}

