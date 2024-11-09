package conn;

class MyClassStaticMethod{
	public static void method() {
		System.out.println("Parent static method");
	}
}


public class StaticDemo extends MyClassStaticMethod{
   static int i; //0
   int j; //0
   
   public static void method() {
	  // super.method(); //static method cannot override
		System.out.println("Parent static method");
	}
   public StaticDemo() {
	   i++;
	   j++;
	   
	   System.out.println("static i="+i);
	   System.out.println("Non static j="+j);
   }
	@SuppressWarnings("unused")
	public static void main(String[] args) {
	
		StaticDemo staticDemo1= new StaticDemo();
		StaticDemo staticDemo2= new StaticDemo();
		StaticDemo staticDemo3= new StaticDemo();
		StaticDemo.method();


	}


}
