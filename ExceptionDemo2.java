package conn;

public class ExceptionDemo2 {


	public static void main(String[] args) {
		int a[]= {4,5,3};
		System.out.println("Before array access");
		try {
		System.out.println(a[3]);
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		System.out.println("after array access");


	}


}
