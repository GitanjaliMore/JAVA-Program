package conn;

interface MyInterface{
	int i=10;  //public static final int i=10;
	void m1(); //public abstract void m1();
	void m2();
}


class MyClass2 implements MyInterface{


	@Override
	public void m1() {
		System.out.println("m1");
		
	}


	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}


	
}


public class InterfaceDemo {


	public static void main(String[] args) {
		MyClass2 myClass2 = new MyClass2();
		myClass2.m1();
		myClass2.m2();
	}
}

