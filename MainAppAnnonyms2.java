package thread;

class TablePrint1{
synchronized void multitable(int num) {
		for(int i=1;i<=10;i++) {
			System.out.println(num+"x"+i+"="+num*i);
		}
	}
}
public class MainAppAnnonyms2 {


	
	public static void main(String[] args) {
		TablePrint1 tp = new TablePrint1();
		Thread th = new Thread() {
			public void run() {
				tp.multitable(5);
				System.out.println("Hi");
			}
		};
		th.start();
		Thread th1 = new Thread() {
			public void run() {
				tp.multitable(3);
				System.out.println("Hi");
			}
		};
		th1.start();
//		new Thread() {
//			public void run() {
//				System.out.println("Hello");
//			}
//		}.start();
//		
//		new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				System.out.println("Baranipriya");
//				
//			}
//		}).start();
//		
//		Runnable rb = new Runnable() {
//			
//			@Override
//			public void run() {
//				System.out.println("How are you?");
//				
//				
//			}
//		};
//		Thread t = new Thread(rb);
//		t.start();


	}


}