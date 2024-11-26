package conn;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {

        // Generic version of ArrayList
        ArrayList<String> courses = new ArrayList<String>();
        courses.add("JFS");
        courses.add("PFS");
        courses.add("MEAN");
        courses.add("MERN");
        // courses.add(1001); // This line should be commented out or removed, as it adds an integer to a list of Strings

        // Printing the entire list
        System.out.println(courses);

        // Accessing and printing individual elements
        System.out.println(courses.get(0));
        System.out.println(courses.get(1));
        System.out.println(courses.get(2));
        System.out.println(courses.get(3));

        // Traversal using a for-each loop
        for (String course : courses) {
            System.out.println(course);
        }
    }
}
/*
1. ArrayList is growable in nature
2. Duplicates are allowed
3. Maintained insertion order
*/
