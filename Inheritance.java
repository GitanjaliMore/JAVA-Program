package conn;

import java.util.Scanner;


class Parentss{
	 int i,j, s;
	 //final float PI=3.14159f;
	 public Parentss() {
		 this.i=0;
		 this.j=0;
		 System.out.println("Parent class ,No argument constr");
	 }
	 public Parentss(int i, int j) {
		 this.i=i;
		 this.j=j;
		// PI=PI+9;
		 
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


class Childss extends Parentss{ //Single Inheritence
	
	
	public Childss(int i, int j) {
		//System.out.println("hello");
		super(i, j); //in child constructor super should be first line
		
	}
	
	public Childss() {
		System.out.println("Child class constructor no argument");
	}
	//inherited methods add(), display()


	void subtract() {
		s=i-j;
	}
	
	 void display() { //overriden method , runtime polymorphisam
		super.display();
		System.out.println("The difference of "+i+" and "+j+" is "+s);
		
	}
}
public class Inheritance {


	@SuppressWarnings("unused")
	public static void main(String[] args) {
//		Parent parent = new Parent();
//		parent.inputData();
//		parent.add();
//		parent.display();
		
		Childss childss1=new Childss();
		
		Childss childss = new Childss(9,8);//child class constr is called
		//child.inputData();
		childss.add();
		childss.subtract();
		childss.display();
		
		


	}


}