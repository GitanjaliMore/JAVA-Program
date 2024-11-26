package java8feature;

import java.util.function.Function;


public class FunctionInterfaceMail1 {


	public static void main(String[] args) {
		Function<String,Integer> obj= (str)->str.length();
		
		System.out.println("Length of the string ="+obj.apply("hello"));


		//use Function Functional interface to reverse the given string
		
		//Reverse the string
		
		Function<String,String> obj1=(str)->{
			StringBuilder bf = new StringBuilder(str);
			return bf.reverse().toString();
			
		};
		
		System.out.println("Reversed String ="+obj1.apply("Welcome Arishma"));
		
		//Hi Hello
		//iH olleH
		//Reverse Each word
		String s="Hi hello how are you";
		String s2="";
		String s1[]=s.split(" ");
		System.out.println("Original length ="+s.length());
		for(int i=0;i<s1.length;i++) {
			String w = s1[i]; //Hi
			StringBuilder br = new StringBuilder(w);
			//System.out.print(br.reverse().toString()+" ");
			s2=s2+br.reverse().toString()+" ";
			
		}
		s2=s2.trim();
		System.out.println("Reverse String "+s2);
		System.out.println("After reverse length="+s2.length());
	}


}
