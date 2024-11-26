package java8feature;
//Function to find length of a given string

import java.util.function.Function;
class FunctionDemo1{
     public static void main(String args[]){
            //create a function reference to lambda expression
           //to find the length of a string

           Function<String,Integer>len=(str)->str.length();
      //find the length of a string str
           String str="EduBridgeIndia Pvt.Ltd";
           System.out.println("Length="+len.apply(str));
     }
}
