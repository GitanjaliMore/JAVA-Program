package thread;

class MyFirstClass extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
		System.out.println("Run method  "+Thread.currentThread());
        }
	}
}


public class MainAppThread {


	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		MyFirstClass myFirstClass = new MyFirstClass();
		
		myFirstClass.start();  //thread cannot be started more than once
		//myFirstClass.start();
		MyFirstClass myFirstClass1 = new MyFirstClass();
		
		myFirstClass1.start(); 
		
}
}