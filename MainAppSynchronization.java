package thread;


class TablePrint{
synchronized void multitable(int num) {
		for(int i=1;i<=10;i++) {
			System.out.println(num+"x"+i+"="+num*i);
		}
	}
}


class Table1 extends Thread{
	TablePrint tp;
	public Table1(TablePrint tp) {
		this.tp = tp;
	}
	public void run() {
		tp.multitable(5);
	}
	
}
class Table2 extends Thread{
	TablePrint tp;
	public Table2(TablePrint tp) {
		this.tp = tp;
	}
	public void run() {
		tp.multitable(2);
	}
	
}

public class MainAppSynchronization {


	public static void main(String[] args) {
		TablePrint tp = new TablePrint();
		Table1 t1=new Table1(tp);
		Table2 t2=new Table2(tp);
		
		t1.start();
		t2.start();
	}
}
