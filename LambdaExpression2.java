package java8feature;

//A lambda expression can have zero or any number of arguments. Let's see the examples:
//Java Lambda Expression Example: No Parameter
	interface Sayable{  
    public String say();  
	}  
	public class LambdaExpression2{  
	public static void main(String[] args) {  
		Sayable s=()->{  
	        return "I have nothing to say.";  
	    };  
	    System.out.println(s.say());  
	}  
	}  
