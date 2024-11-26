package conn;

import java.util.LinkedList;

public class LinkedListDemo {


	public static void main(String[] args) {
		//int a[]=new int[4];
		
		LinkedList<Integer> alist = new LinkedList<Integer>();
		alist.add(34);
		alist.add(341);
		alist.add(124);
		alist.add(344);
		alist.add(534);
		alist.add(234);
		System.out.println(alist);
		//alist.clear();
		alist.removeFirst();
		alist.removeLast();
		alist.add(2, 100);
		System.out.println(alist);
		
		
	}


}
