package java8feature;

//function interface lambda expression



import java.util.function.Function;


public class FunctionInterfaceMail {


	public static void main(String[] args) {
		Function<String,Integer> obj= (str)->str.length();
		
		System.out.println("Length of the string ="+obj.apply("hello"));


		//use Function Functional interface to reverse the given string
		
		//Reverse the string
		
		Function<String,String> obj1=(str)->{
			StringBuilder bf = new StringBuilder(str);
			return bf.reverse().toString();
			
		};
		
		System.out.println("Reversed String ="+obj1.apply("hello"));
		
	}


}

