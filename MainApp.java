package mulbigno;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class MainApp {
	
	 public static String multipyNumbers(String A, String B) {
		BigInteger n1=new BigInteger(A);
		BigInteger n2=new BigInteger(B);
			
		return n1.multiply(n2).toString(); 
			 
		 }


		public static void main(String[] args) throws IOException {
			String A,B;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			A = br.readLine(); //876979647567
			B= br.readLine(); //98575967947945
			
			System.out.println(MainApp.multipyNumbers(A,B));
			
		}


	}
