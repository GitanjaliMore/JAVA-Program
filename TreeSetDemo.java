package conn;

import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
	TreeSet<Integer> ts = new TreeSet<Integer>();
	ts.add(100);
	ts.add(500);
	ts.add(400);
    ts.add(200);
	ts.add(300);
    System.out.println(ts);
	ts.add(100);
	System.out.println(ts);
	ts.add(null);
	System.out.println(ts);
	}
	}


