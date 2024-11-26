package conn;

abstract class MyClass{
	 abstract void add();
	 void display() {
		 System.out.println("Display method");
	 }
}

abstract class ImplClass extends MyClass{


//	@Override
 // void add() {
	//System.out.println("add method");
	//}
	 
}

class MySecondImplClass extends ImplClass{


	@Override
	void add() {
		// TODO Auto-generated method stub
		
	}
	 
}


public class MainAppAbstract{
	
   public static void main(String args[]){
         
   	MySecondImplClass mySecondImplClass = new MySecondImplClass();
   	mySecondImplClass.display();
   	mySecondImplClass.add();
   }
}

