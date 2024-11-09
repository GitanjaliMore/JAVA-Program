package conn;

//static keyword



class Employeee{
	int eid;
	String ename;
	static String cname;
	
	public Employeee(int eid, String ename) {
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
}


public class MainStaticDemo {
   
	public static void main(String[] args) {
		Employeee employee1 = new Employeee(1111,"Sweta");
		Employeee employee2 = new Employeee(1112,"Madhuri");
		employee1.displayData();
		employee2.displayData();






	}


}
