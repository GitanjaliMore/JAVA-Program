package conn;

class Parent2{
	 private int i;
	public Parent2(int i){
		//this.i=i;
	}
	
	public void display() {
		System.out.println(i);
	}
}


class Childsss extends Parent2{
//	public Child()
//	{
//		System.out.println("no argument constructor");
//	}
	public Childsss(int i) {
		//System.out.println("hello");
		//this();
		super(i); //to call parent class constructor, this should be first line
	    
		
	}
	
	public void display() {
		System.out.println("display of child");
		super.display();
		
	}
}
public class SuperClass {


	public static void main(String[] args) {
		Childsss childsss = new Childsss(10);
		childsss.display(); //child class method is called
		//Child child1=new Child();
	}


}
