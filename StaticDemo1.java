package conn;

public class StaticDemo1 {
   static int i; //0
   int j; //0
   
   public StaticDemo1() {
	   i++;
	   j++;
	   
	   System.out.println("static i="+i);
	   System.out.println("Non static j="+j);
   }
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		StaticDemo1 staticDemo1= new StaticDemo1();
		StaticDemo1 staticDemo2= new StaticDemo1();
		StaticDemo1 staticDemo3= new StaticDemo1();
		


	}


}
