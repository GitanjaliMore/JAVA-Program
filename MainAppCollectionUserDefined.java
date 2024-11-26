package conn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;


class Student3{
	private int sid;
	private String sname;
	
	public Student3() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student3(int sid, String sname) {
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


class Student3SortID implements Comparator<Student3>{


	@Override
	public int compare(Student3 s1, Student3 s2) {
		if(s1.getSid()<s2.getSid())
			return -1;
		else if(s1.getSid()>s2.getSid())
			return 1;
		else
			return 0;
			
	}
	
}


public class MainAppCollectionUserDefined {


	public static void main(String[] args) {
		ArrayList<Student3> alist = new ArrayList<Student3>();
		
		Student3 sob1 = new Student3(6,"Sravani");
		alist.add(sob1);
		//alist.add(new Student(1,"Sravani"));
		Student3 sob2 = new Student3(1,"Baranipriya");
		alist.add(sob2);
		Student3 sob3 = new Student3(3,"Bharati");
		alist.add(sob3);
		Student3 sob4 = new Student3(8,"Pooja");
		alist.add(sob4);
		Student3 sob5 = new Student3(5,"Nandhini");
		alist.add(sob5);
		
		System.out.println(alist);
		
		//Iterate
		Iterator<Student3> itor =alist.iterator();
		
		System.out.println("SID\tSNAME");
		while(itor.hasNext()) {
		Student3 s1=	itor.next();
		//System.out.println(s1);
		System.out.println(s1.getSid()+"\t"+s1.getSname());
		}
		//Collections.sort(alist);
		
		Student3SortID srt = new Student3SortID();
		Collections.sort(alist,srt);
		
		System.out.println("After sort");
   Iterator<Student3> itor1 =alist.iterator();
		
		System.out.println("SID\tSNAME");
		while(itor1.hasNext()) {
		Student3 s1=	itor1.next();
		//System.out.println(s1);
		System.out.println(s1.getSid()+"\t"+s1.getSname());
		}
		
		
		
		
	}


}
