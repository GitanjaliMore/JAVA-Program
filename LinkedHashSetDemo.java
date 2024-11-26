package conn;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

		public static void main(String[] args) {
			LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();
			hs.add(100);
			hs.add(500);
			hs.add(400);
			hs.add(200);
			hs.add(300);
			System.out.println(hs);
			hs.add(100);
			System.out.println(hs);
			hs.add(null);
			System.out.println(hs);
}
}
