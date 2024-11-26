package conn;

class AgeCheckException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public AgeCheckException(String s) {
		super(s);
	}
}


class Voting{
	public void  checkAge(int age) {
		try {
		if(age<18) {
			throw new AgeCheckException("Not eligible to vote");
		}
		else {
			System.out.println("You can vote");
		}
		}catch(AgeCheckException e) {
			e.printStackTrace();
		}
	}
}
public class ExceptionDemo6 {


	public static void main(String[] args) {
		Voting voting = new Voting();
		voting.checkAge(5);


	}


}
