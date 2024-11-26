package thread;

class MyFirst extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
		System.out.println("Run method  "+Thread.currentThread());
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
        }
		
	}
}
public class MainAppThread2 {


	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread());
		MyFirst myFirst = new MyFirst(); //new
		myFirst.setName("first");
		System.out.println("before start First Thread state "+myFirst.isAlive());
		myFirst.start();//Runnable  //thread cannot be started more than once
		System.out.println("after start First Thread state "+myFirst.isAlive());
		//myFirstClass.start();
		MyFirst myFirst1 = new MyFirst();
		myFirst1.setName("second");
		
		myFirst.join();
		System.out.println("after join method First Thread state "+myFirst.isAlive());
		myFirst1.start(); //Runnable
		System.out.println("name of the Thread is "+myFirst1.getName());
//		MyFirstClass myFirstClass2 = new MyFirstClass();
//		myFirstClass2.start(); 
		}
}
