package conn;

import java.util.LinkedList;

public class LinkedListDemo1 {
	public static void main(String[] args) {
		LinkedList<Double> li= new LinkedList<Double>();
		li.add(25.00);
		li.add(45.00);
		li.add(67.90);
		li.add(2400.88);
		li.add(4500.32);
		
		System.out.println(li);
	
		//alist.clear();
		li.removeFirst();
		li.removeLast();
		li.add(2, 100.00);
		System.out.println(li);
		
	}

}
