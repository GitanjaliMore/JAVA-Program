package thread;

class MySecondClass implements Runnable{


	@Override
	public void run() {
			for(int i=1;i<=5;i++) {
		System.out.println("Thread name "+Thread.currentThread());
	}
	}
}


public class MainAppRunnable {


	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		MySecondClass  mySecondClass = new MySecondClass();
		Thread tob = new Thread(mySecondClass);
		tob.setName("t1");
		tob.setPriority(1);
		System.out.println("to know priority "+tob.getPriority());
		tob.start();
		//1->min
		//5->normal
		//10->maximum
		MySecondClass  mySecondClass1 = new MySecondClass();
		Thread tob1 = new Thread(mySecondClass);
		tob1.setPriority(10);
		tob1.setName("t2");
		tob1.start();



	}


}