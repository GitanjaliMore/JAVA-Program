package java8feature;

//Java Lambda Expression Example: Foreach Loop
import java.util.ArrayList;  
	public class LambdaExpression6{  
	    public static void main(String[] args) {  
	          
	       ArrayList<String> list=new ArrayList<String>();  
	    list.add("ankit");  
        list.add("mayank");  
        list.add("irfan");  
	    list.add("jai");  
	    //  for(String s:list){sopl(s);}
	    list.forEach(  
	            (n)->System.out.println(n)  
	        );  
	    }  
	}  
