package java8feature;

//Write a program to create a stream with the elements of an ArrayList and get elements which are greater that  5 into a new list.

/*To create a stream from ArrayList and collect the elements of a stream into a list*/
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Convert1{
      public static void main(String args[]){
             //create a list to store Integer objects
            List<Integer>lst=new ArrayList<Integer>();

          //add the elements to the list
           for(int i=1;i<=10;i++){
                lst.add(i);
          }

          //convert this list into stream using stream()
           Stream<Integer>sm=lst.stream();

           //filter the elements which are greater than 5 and collect them 
           //into a list using collect(Collectors.toList())*/
 
         List<Integer>lst1=sm.filter(i->i>5).collect(Collectors.toList());
         //display the new list
         System.out.println(lst1);
       }
}

