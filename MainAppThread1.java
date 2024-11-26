package thread;

class MyClass extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
		System.out.println("Run method  "+Thread.currentThread());
        try {
        	Thread.sleep(5000);
        }catch(InterruptedException e) {
        	e.printStackTrace();
        }
		}
	}
}


public class MainAppThread1 {


	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		MyClass myClass = new MyClass();
		myClass.setName("first");
		myClass.start();  //thread cannot be started more than once
		//myFirstClass.start();
		MyClass myClass1 = new MyClass();
		myClass1.setName("second");
		myClass1.start(); 
		System.out.println("name of the Thread is "+myClass1.getName());
//		MyFirstClass myFirstClass2 = new MyFirstClass();
//		myFirstClass2.start(); 
		}
}
