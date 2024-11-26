package conn;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<String> s = new Stack<String>();
		s.push("Java");
		s.push("Python");
		s.push("Go");
		s.push("Angular");
		s.push("ReactJs");
		s.push("JavaScript");
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s);
	}

}
