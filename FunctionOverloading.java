package conn;

/*
 * Function Overloading
 can we overload function based on return type
 */



public class FunctionOverloading {
	void display(){
		System.out.println("No argument display method");
	}
	
	void display(int i){
		System.out.println("one argument int type");
	}
	void display(float f){
		System.out.println("float argument type");
	}
	void display(double d){
		System.out.println("double argument type");
	}
	void display(char f){
		System.out.println("char argument type");
	}
	
	void display(int i, int j){
		System.out.println("two argument of type int and int");
	}
	void display(int i, float j){
		System.out.println("two argument of type int and float");
	}
	void display(float j, int i){
		System.out.println("two argument of type float and int");
	}
  void display(byte b) {
	  System.out.println("byte method");
  }
  void display(short b) {
	  System.out.println("short method");
  }
  void display(long b) {
	  System.out.println("long method");
  }


	public static void main(String[] args) {
		FunctionOverloading functionOverloading = new FunctionOverloading();
		functionOverloading.display();
		functionOverloading.display(34);
		functionOverloading.display(56.3);//double
		functionOverloading.display(5.3f); //float
		functionOverloading.display('c');
		functionOverloading.display(56.3f,56); //float , int
		functionOverloading.display(3,56.7f); //int , float
		functionOverloading.display((byte)3); //
		functionOverloading.display((short)3); //
		functionOverloading.display((long)3); //
		
		


	}


}