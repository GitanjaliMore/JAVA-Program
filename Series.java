package conn;
//1/1+1/2+1/3+1/4+.........+1/10
public class Series {
	public static void main(String[] args) {
		double result=0.0;
		int num=1;
		
		for(int i=1;i<=10;i++) {
			result +=(double)num/i;
			System.out.println("1/1+1/2+1/3+1/4+.........+1/10="+result);
		}
		
	}

}
