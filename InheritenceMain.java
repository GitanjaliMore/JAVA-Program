package conn;
import java.util.Scanner;


class Parent{
	int i,j, s;
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
	void display() {
		System.out.println("The sum of "+i+" and "+j+" is "+s);
	}
	
}


class Child extends Parent{ //Single Inheritence
	void subtract() {
		s=i-j;
	}
	
	void display() {
		super.display();
		System.out.println("The difference of "+i+" and "+j+" is "+s);
		
	}
}
public class InheritenceMain {


	public static void main(String[] args) {
		Parent parent = new Parent();
		parent.inputData();
		parent.add();
		parent.display();
		
		Child child = new Child();
		child.inputData();
		child.subtract();
		child.display();


	}


}






