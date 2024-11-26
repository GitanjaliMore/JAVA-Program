package java8feature;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class ListStreamAPI {


	public static void main(String[] args) {
		List<Integer> lobj = new ArrayList<Integer>();
		
		for(int i=1;i<=10;i++) {
			lobj.add(i);
		}
		
		Stream<Integer>sobj=lobj.stream();
		List<Integer> flist = sobj.filter(x->x>5).collect(Collectors.toList());
		System.out.println(flist);
		Stream<Integer>sobj1=lobj.stream();
		List<Integer> flist1=sobj1.filter(x->x<5).collect(Collectors.toList());
		System.out.println(flist1);
		
		//exatract even number
		Stream<Integer>sobj2=lobj.stream();
		List<Integer> flist2=sobj2.filter(x->x%2!=0).collect(Collectors.toList());
		System.out.println(flist2);
		
		
		
	}


}