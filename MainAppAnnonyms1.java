package thread;

public class MainAppAnnonyms1 {


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
		
		Runnable rob = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Run method of runnable");
				
			}
		};
		Thread t1=new Thread(rob);
		t1.start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
		}
		}).start();;
		
	}


}

