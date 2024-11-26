package conn;

//collection
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;


public class MyArrayListDemo {


	public static void main(String[] args) {
		//int a[]=new int[4];
		
		ArrayList<Integer> alist = new ArrayList<Integer>();
		alist.add(34);
		alist.add(341);
		alist.add(134);
		alist.add(334);
		alist.add(634);
		alist.add(734);
		System.out.println(alist);
		//alist.clear();
		alist.removeFirst();
		alist.removeLast();
		alist.add(2, 100);
		System.out.println(alist);
		
		//Float
		//String
		//LinkedList
		//Vector
	}


}