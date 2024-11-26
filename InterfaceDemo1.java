package conn;

interface MyInterface1{
	int i=10;  //public static final int i=10;
	void m1(); //public abstract void m1();
	void m2();
}


abstract class MyClass3 implements MyInterface{


	@Override
	public void m1() {
		System.out.println("m1");
		
	}


//	@Override
//	public void m2() {
//		System.out.println("m2");
//		
//	}


}


class MyClass4 extends MyClass3{


	@Override
	public void m2() {
		System.out.println("m2 method");
		
	}
	
}
public class InterfaceDemo1 {


	public static void main(String[] args) {
		MyClass4  myClass4 = new MyClass4();
		myClass4.m1();
		myClass4.m2();
	}
}



