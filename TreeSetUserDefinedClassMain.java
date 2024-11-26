package conn;
//compare to id
import java.util.TreeSet;


class Student1 implements Comparable<Student1>{
	private int sid;
	private String sname;
	
	public Student1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student1(int sid, String sname) {
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
	@Override
	public int compareTo(Student1 o) {
		// TODO Auto-generated method stub
		if(sid<o.getSid())
		  return -1;
		else if(sid>o.getSid())
			return 1;
		else
			return 0;
	}
	
}


public class TreeSetUserDefinedClassMain {


	public static void main(String[] args) {
		//StudentSortID1 ssortid = new StudentSortID1();
		TreeSet<Student1> tobj = new TreeSet<Student1>();
		
		Student1 sob1 = new Student1(6,"Sravani");
		tobj.add(sob1);
		//alist.add(new Student(1,"Sravani"));
		Student1 sob2 = new Student1(1,"Baranipriya");
		tobj.add(sob2);
		Student1 sob3 = new Student1(3,"Bharati");
		tobj.add(sob3);
		Student1 sob4 = new Student1(8,"Pooja");
		tobj.add(sob4);
		Student1 sob5 = new Student1(5,"Nandhini");
		tobj.add(sob5);
		
		System.out.println(tobj);
}
}
