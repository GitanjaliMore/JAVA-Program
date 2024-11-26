package thread;

public class MainAppAnnonyms {


	public static void main(String[] args) {
		Thread t=new Thread() {
			public void run() {
				System.out.println("Run method");
			}
		};
		
		t.start();
		
		new Thread() {
			public void run() {
				System.out.println("Run method");
			}
		}.start();


	}


}
