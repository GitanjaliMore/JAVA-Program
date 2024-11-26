package java8feature;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ListCountWordLength {


	public static void main(String[] args) {
		List<String> lw = new ArrayList<String>();
		lw.add("Japan");
		lw.add("India");
		lw.add("China");
		lw.add("USA");
		lw.add("Canada");
		
		Iterator<String> lit =lw.iterator();
		
		while(lit.hasNext()) {
			String w=lit.next();
			if(w.length()>4) {
				System.out.println(w);;
			}
		}


	}


}

