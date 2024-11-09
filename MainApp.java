package conn;


//inheritance
 class A{
   public A(){
      System.out.println("Class A");
   }
}

class B extends A{
public B(){
      System.out.println("Class B");
   }

}

class C extends B{
public C(){
      System.out.println("Class C");
   }
}
//class D extends B,C{  //java does not supports multiple inheritance
//}
public class MainApp{
   
	
	@SuppressWarnings("unused")
	public static void main(String args[]){
        B b = new B();
   }
}