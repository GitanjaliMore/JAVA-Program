package conn;

import java.util.TreeSet;

public class TreeSetDemo1 {
	public static void main(String[] args) {
		TreeSet<String> courses = new TreeSet<String>();
		courses.add("Java");
		courses.add("Python");
		courses.add("DFS");
		courses.add("DotNet");
		courses.add("Networking");
		
		System.out.println(courses);
		 // Traversal using a for-each loop
		 for (String course : courses) {
	            System.out.println(course);
	}

}
}


