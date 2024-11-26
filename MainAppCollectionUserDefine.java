package conn;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


class Student2{
	private int sid;
	private String sname;
	public Student2() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student2(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + "]";
	}
	
	
	
}




public class MainAppCollectionUserDefine {


	public static void main(String[] args) {
		ArrayList<Student2> alist = new ArrayList<Student2>();
		
		Student2 sob1 = new Student2(1,"Sravani");
		alist.add(sob1);
		//alist.add(new Student(1,"Sravani"));
		Student2 sob2 = new Student2(2,"Baranipriya");
		alist.add(sob2);
		Student2 sob3 = new Student2(3,"Bharati");
		alist.add(sob3);
		Student2 sob4 = new Student2(4,"Pooja");
		alist.add(sob4);
		Student2 sob5 = new Student2(5,"Nandhini");
		alist.add(sob5);
		
		System.out.println(alist);
		
		//Iterate
		Iterator<Student2> itor =alist.iterator();
		
		System.out.println("SID\tSNAME");
		while(itor.hasNext()) {
		Student2 s1=	itor.next();
		//System.out.println(s1);
		System.out.println(s1.getSid()+"\t"+s1.getSname());
			
		}
		
		//primitive data type
		ArrayList<Integer> lst = new ArrayList<Integer>();
		for(int i=1;i<=10;i++) {
		lst.add(i);
		}	
		System.out.println(lst);
		
		Iterator<Integer> it = lst.iterator();
		while(it.hasNext()) {
			int i=it.next();
			System.out.println(i);
		}
		//predefine collections classes
		Collections.sort(lst);
		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		for(int i=10;i>=1;i--) {
		lst1.add(i);
		}	
		System.out.println(lst1);
		
		
		
		Collections.sort(lst1);
		Iterator<Integer> it1 = lst1.iterator();
		while(it1.hasNext()) {
			int i=it1.next();
			System.out.println(i);
		}
		
		Collections.swap(lst1, 2, 8);
		System.out.println(lst1);
		
	   Collections.shuffle(lst1);
	   System.out.println(lst1);
	   Collections.shuffle(lst1);
	   System.out.println(lst1);
	}


}

