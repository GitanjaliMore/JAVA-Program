package java8feature;

//Java Example with Lambda Expression
//Now, we are implementing the above example with the help of lambda expression.
@FunctionalInterface  //It is optional  
interface Drawable1{  
	public void draw();  
	}  
	  
	public class LambdaExpression1 {  
	    public static void main(String[] args) {  
	        int width=10;  

	        //with lambda  
Drawable1 d2=()->{  
	            System.out.println("Drawing "+width);  
	        };  
d2.draw();  
	    }  
}  
