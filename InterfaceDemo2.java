package conn;

//interface
interface MyInterface2{
	int i=10;  //public static final int i=10;
	void m1(); //public abstract void m1();
	void m2();
}


class MyClass5 implements MyInterface2{


	@Override
	public void m1() {
		System.out.println("m1");
		
	}


	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}


	
}


public class InterfaceDemo2 {


	public static void main(String[] args) {
		MyClass5 myClass5 = new MyClass5();
		myClass5.m1();
		myClass5.m2();
	}
}
