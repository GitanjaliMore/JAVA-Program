package conn;

import java.util.Scanner;


class Parents{
	 int i,j, s;
	 public Parents() {
		 this.i=0;
		 this.j=0;
		 System.out.println("No argument constr");
	 }
	 public Parents(int i, int j) {
		 this.i=i;
		 this.j=j;
		 
	 }
	void inputData() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two values");
		i = scanner.nextInt();
		j = scanner.nextInt();
	}
	void add() {
		s=i+j;
	}
	//public->protected->default->private
	 void display() {
		System.out.println("The sum of "+i+" and "+j+" is "+s);
	}
	
}


class Childs extends Parents{ //Single Inheritence
	
	public Childs(int i, int j) {
		//System.out.println("hello");
		super(i, j); //in child constructor super should be first line
		
	}
	void subtract() {
		s=i-j;
	}
	
	 void display() { //overriden method , runtime polymorphisam
		super.display();
		System.out.println("The difference of "+i+" and "+j+" is "+s);
		
	}
}
public class InheritenceMain1
{


	public static void main(String[] args) {
//		Parent parent = new Parent();
//		parent.inputData();
//		parent.add();
//		parent.display();
		
		Childs childs = new Childs(9,8);//child class constr is called
		//child.inputData();
		childs.add();
		childs.subtract();
		childs.display();


	}


}
