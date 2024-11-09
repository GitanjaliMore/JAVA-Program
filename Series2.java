package conn;

public class Series2 {
	public static void main(String[] args) {
		double result=0.0;
		int sum,num=1;
		
		for(int i=1;i<=10;i++) {
			sum=1;
			for(int j=i;j>1;j--) {
				sum*=j;
			}
			result +=(double)num/sum;
		}
			System.out.println("1/1!+1/2!+1/3!+1/4!+.........+1/10!="+result);
		}
		
	}





