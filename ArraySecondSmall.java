package conn;
import java.util.Arrays;
public class ArraySecondSmall {

    public int getSecondSmallest(int[] arr) {
        if (arr == null || arr.length < 2) {
            //throw new IllegalArgumentException("Array must contain at least two elements.");
        }

        Arrays.sort(arr);
        return arr[1];
    }

    public static void main(String[] args) {
        ArraySecondSmall source = new ArraySecondSmall();
        int[] arr = {23, 45, 32, 22, 20, 96};
        System.out.println(source.getSecondSmallest(arr));  // Output: 22
    }
}