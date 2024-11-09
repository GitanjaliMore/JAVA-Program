package conn;

//set and get method



class EncapsulationExample{
	private int num1;
	private int num2;
	
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
	
}


public class EncapsulationDemoMain {
	public static void main(String[] args) {
		EncapsulationExample encapsulationExample = new EncapsulationExample();
		encapsulationExample.setNum1(2);
		encapsulationExample.setNum1(6);
		
		System.out.println("Num1 value is "+encapsulationExample.getNum1());
		
	}


}

