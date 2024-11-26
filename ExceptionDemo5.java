package conn;

public class ExceptionDemo5 {


	public static void main(String[] args) {
		int a=10,b=0,c;
		System.out.println("Before division");
		try {
			if(b==0) {
			    throw new ArithmeticException("Denominator is Zero, cannot divide");
		    }else {
		    	c=a/b;
		    	System.out.println(c);
		    }
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
	}


}
