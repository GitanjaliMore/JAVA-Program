package conn;



//different blocks in java



public class JavaBlockMain {

	static {
		System.out.println("static block1");
	}
	static {
		System.out.println("static block2");
	}
	
	{
	     System.out.println("annonymous block 1");	
	}
	{
	     System.out.println("annonymous block 2");	
	}
	public JavaBlockMain() {
		super();
		System.out.println("Constructor block");
	}


	@SuppressWarnings("unused")
	public static void main(String[] args) {
		System.out.println("Main method block" );
		JavaBlockMain javaBlockMain = new JavaBlockMain();
	}


}