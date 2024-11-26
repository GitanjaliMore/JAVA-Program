package java8feature;


interface ConvertStringUppercase{
	String StringUpper(String str);
}

interface UserValidation{
	void validateUser(String username , String password);

}
public class StringLambdaExpression {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ConvertStringUppercase obj = (str)->{
			//return str.toUpperCase();
		//};
		ConvertStringUppercase obj1 = (str)->str.toUpperCase();

		System.out.println("Afrter Converting Uppercase:"+obj1.StringUpper("gitanjali"));

		UserValidation obj2 = (username , password)->{
			if(username.equalsIgnoreCase("Admin") && password.equals("Admin123")) {
				System.out.println("Valid user");
			}else {
				System.out.println("Invalid User");
			}
		};
		obj2.validateUser("admin", "Admin123");

	}

}
