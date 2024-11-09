package conn;

//using constructor encapsulation

class Encapsulation{
	private int num1;
	private int num2;
	
	
	public Encapsulation() {
		super();//class Object class constructor
		// TODO Auto-generated constructor stub
	}




	public Encapsulation(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	
	
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}




	@Override
	public String toString() {
		return "Encapsulation [num1=" + num1 + ", num2=" + num2 + "]";
	}
	
	
	
}


public class EncapsulationDemoMain1 {


	public static void main(String[] args) {
		Encapsulation encapsulation = new Encapsulation();
		encapsulation.setNum1(2);
		encapsulation.setNum1(6);
		
		System.out.println("Num1 value is "+encapsulation.getNum1());
		
	}


}
