package conn;
// Treeset using compare to id and name

import java.util.Comparator;
import java.util.TreeSet;


//class Student1 implements Comparable<Student1>{
class Student4{
	private int sid;
	private String sname;
	
	public Student4() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student4(int sid, String sname) {
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
	/*@Override
	public int compareTo(Student1 o) {
		// TODO Auto-generated method stub
		if(sid<o.getSid())
		  return -1;
		else if(sid>o.getSid())
			return 1;
		else
			return 0;
	}*/
	
	
}


class StudentSortID1 implements Comparator<Student4>{


	@Override
	public int compare(Student4 s1, Student4 s2) {
		if(s1.getSid()<s2.getSid())
			return -1;
		else if(s1.getSid()>s2.getSid())
			return 1;
		else
			return 0;
			
	}
	
}


class StudentSortName1 implements Comparator<Student4>{


		@Override
	public int compare(Student4 o1, Student4 o2) {
		// TODO Auto-generated method stub
		if(o1.getSname().compareToIgnoreCase(o2.getSname())<0)
			return -1;
		else
			return 0;
	}
}
public class TreeSetUserDefinedClassMain1 {


	public static void main(String[] args) {
		//StudentSortID1 ssortid = new StudentSortID1();
		TreeSet<Student4> tobj = new TreeSet<Student4>(new StudentSortID1());
		
		Student4 sob1 = new Student4(6,"Sravani");
		tobj.add(sob1);
		//alist.add(new Student(1,"Sravani"));
		Student4 sob2 = new Student4(1,"Baranipriya");
		tobj.add(sob2);
		Student4 sob3 = new Student4(3,"Bharati");
		tobj.add(sob3);
		Student4 sob4 = new Student4(8,"Pooja");
		tobj.add(sob4);
		Student4 sob5 = new Student4(5,"Nandhini");
		tobj.add(sob5);
		
		
		System.out.println(tobj);
		
 TreeSet<Student4> tobj1 = new TreeSet<Student4>(new StudentSortName1());
		
		Student4 sob6 = new Student4(6,"Sravani");
		tobj1.add(sob6);
		//alist.add(new Student(1,"Sravani"));
		Student4 sob7 = new Student4(1,"Baranipriya");
		tobj1.add(sob7);
		Student4 sob8 = new Student4(3,"Bharati");
		tobj1.add(sob8);
		Student4 sob9 = new Student4(8,"Pooja");
		tobj1.add(sob9);
		Student4 sob10 = new Student4(5,"Nandhini");
		tobj1.add(sob10);
		System.out.println(tobj1);
		
}
}

