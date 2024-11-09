package conn;

//constructor or with argument

class Employee{
	String name;
	//constructor : is special type of method
	 //name is same as class , always make construcor public
	//constructor is called implicitly on creation of an object
	//constructor is used to initialize instance variable of a class
//	public Employee() {  //constructor no argument
//		System.out.println("constructor is called");
//		name="Sweta";
//	}
	
	public Employee(String name) {
		this.name = name;
		System.out.println(this);
	}
	
	void displayEmployee() {
		System.out.println("name= "+this.name);
	}
}


public class MainAppEmployee {


	public static void main(String[] args) {
		
       Employee employee = new Employee("Baranipriya");
       Employee employee1 = new Employee("Sanskriti");
       System.out.println(employee);
       System.out.println(employee1);
       employee.displayEmployee();
       employee1.displayEmployee();
	}


}