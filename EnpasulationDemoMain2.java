package conn;


class EncapsulationExample1{
	   private int num1;
		private int num2;
		
		
		
		public EncapsulationExample1() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
		
		public EncapsulationExample1(int num1, int num2) {
			super(); //Object class constructor is called
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
			return "EncapsulationExample1 [num1=" + num1 + ", num2=" + num2 + "]";
		}
		
	}


	public class EnpasulationDemoMain2 {


		public static void main(String[] args) {
			EncapsulationExample1 encapsulationExample = new EncapsulationExample1();
			encapsulationExample.setNum1(2);
			encapsulationExample.setNum1(6);
			
			System.out.println("Num1 value is "+encapsulationExample.getNum1());
			
		}


	}