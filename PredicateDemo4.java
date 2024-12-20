package java8feature;

//Predicate to display required numbers from the list
import java.util.function.Predicate;
class PredicateDemo4{
  public static void main(String args[]){
          //take a group of integer objects in an array
          Integer []arr={8,9,10,11,12,13,14,15,16};
          //create Predicate references
         Predicate<Integer>gt,lt;

        //Lambda expression to return true if the number  >10
       gt=(n)->n>10;

           //Lambda expression to return true if the number  <15
       lt=(n)->n<15;

      System.out.println("Numbers >10 and <15");
      display(gt.and(lt), arr);
     
      System.out.println("Numbers <=10 and >=15");
      display(gt.and(lt).negate(), arr);
      
 }
  static void display(Predicate<Integer>p, Integer []arr){
          for(Integer i:arr){
             if(p.test(i)) 
                    System.out.println(i+" ");
            }
}
}
