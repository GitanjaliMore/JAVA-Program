package thread;

class Bank{
	private float amount;
	public Bank() {
		amount=1000;
	}
synchronized public void deposit(float damount) {
		if(damount<0) 
			System.out.println("Negative amount is not allowed");
		amount=amount+damount;
		System.out.println("After deposit amount="+amount);
		 notify();
		 System.out.println("After notify");
		}
	
	
synchronized public void withdraw(float wamount) throws InterruptedException {
		//condition to check when you withdraw
		if(wamount>amount) 
			System.out.println("Insufficient Balanace, you cannot withdraw");
			wait();
		    System.out.println("After deposit");
			amount =amount-wamount;
			System.out.println("After withdraw balance amount="+amount);
		}
}


public class MainAppThreadCommunication {


	public static void main(String[] args) {
		Bank bank = new Bank();
		
		Thread t1 = new Thread() {
			public void run() {
				try {
					bank.withdraw(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		t1.start();
		Thread t2 = new Thread() {
			public void run() {
				bank.deposit(3000);
			}
		};
		t2.start();




	}


}

