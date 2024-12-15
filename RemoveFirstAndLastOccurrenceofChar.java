package com.edu;
import java.util.ArrayList;
import java.util.List;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;




public class RemoveFirstAndLastOccurrenceofChar {
	public static String removeFirstAndLastChar(String word, char ch) {
		List<Character> clist = new ArrayList<Character>();
		
		for(int i=0;i<word.length();i++) {
			clist.add(word.charAt(i));
		}
		
		//remove first occurrence of char
		System.out.println(clist);
		for(int i=0;i<clist.size();i++) {
			char c = clist.get(i);
			if(c==ch) {
				clist.remove(i);
				break;
			}
		}
		
		
		//remove last occurrence of char
		for(int i=clist.size()-1;i>=0;i--) {
			char c = clist.get(i);
			if(c==ch) {
				clist.remove(i);
				break;
			}
		}
		System.out.println(clist.toString());
		
		
        // Convert list to string
		
		StringBuilder br = new StringBuilder();
		
		for(int i=0;i<clist.size();i++) {
			br.append(clist.get(i));
		} 
		return br.toString(); 
		
	}


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String word;
	    char c;
	    word=br.readLine();
	    c=br.readLine().charAt(0);
	   System.out.println(RemoveFirstAndLastOccurrenceofChar.removeFirstAndLastChar(word,c));

	}


}
