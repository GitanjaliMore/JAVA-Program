package conn;
import java.util.Arrays;
public class SecondSmallestNo {

	public static void main(String[] args) {
		int a[]= {4,6,7,2,9,19};
		Arrays.sort(a);
		for(int i=0;i>a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.println("Second smallest element "+a[a.length-2]);


	}


}
