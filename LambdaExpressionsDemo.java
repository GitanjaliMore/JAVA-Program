package conn;
@FunctionalInterface
interface MyFunctionalInterface{
	void greet();
	
}
@FunctionalInterface
interface MyFunctionalInterface2{
	int findSquare(int num);
}
public class LambdaExpressionsDemo {
	public static void main(String[] args) {
		MyFunctionalInterface myfun = ()-> System.out.println("Hii Everyone");
		myfun.greet();
	
		//MyFunctionalInterface2 myfun2 = (int num)  -> { return num * num ;}; 
		//or
		MyFunctionalInterface2 myfun2 = num  -> num * num ;
		int square = myfun2.findSquare(10);
		System.out.println(square);
	}

}
