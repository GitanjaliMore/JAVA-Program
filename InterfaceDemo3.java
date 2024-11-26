package conn;

//multiple interface implementation



interface MyInterface3{
	int i=10;  //public static final int i=10;
	void m1(); //public abstract void m1();
	void m2();
}


abstract class MyClass6 implements MyInterface3{


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


class MyClass7 extends MyClass6{


	@Override
	public void m2() {
		System.out.println("m2 method");
		
	}
	
}
public class InterfaceDemo3 {


	public static void main(String[] args) {
		MyClass7 myClass7 = new MyClass7();
		myClass7.m1();
		myClass7.m2();
	}
}