package conn;
import java.util.HashSet;
public class HashSetDemo1 {
		public static void main(String[] args) {
			HashSet<String> courses = new HashSet<String>();
			courses.add("Java");
			courses.add("Python");
			courses.add("DFS");
			courses.add("DotNet");
			
			System.out.println(courses);
			 // Traversal using a for-each loop
			 for (String course : courses) {
		            System.out.println(course);
		}

	}
}


