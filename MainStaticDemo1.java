package conn;

class Employeeee{
	int eid;
	String ename;
	static String cname;
	
	public Employeeee(int eid, String ename) {
		this.eid = eid;
		this.ename=ename;
	}
	static {
		cname="EduBridgeIndia Pvt.ltd";
	}
	
	void displayData() {
		System.out.println("Id="+eid);
		System.out.println("Name="+ename);
		System.out.println("Cname="+cname);
	}
	
	static void staticMethod() {
		//System.out.println(eid);
		System.out.println(cname);
	}
}


public class MainStaticDemo1 {
   static int i;
	public static void main(String[] args) {
		Employeeee employee1 = new Employeeee(1111,"Sweta");
		Employeeee employee2 = new Employeeee(1112,"Madhuri");
		employee1.displayData();
		employee2.displayData();
        System.out.println(i);
        System.out.println(Employeeee.cname);




	}


}