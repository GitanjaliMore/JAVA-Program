package conn;

public class ArraySort {
    public char maxOccuringChar(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("String must not be null or empty.");
        }

        int[] charCounts = new int[256];  // Array to store the frequency of each character
        int maxCount = 0;
        char result = str.charAt(0);

        // Count the frequency of each character
        for (char c : str.toCharArray()) {
            charCounts[c]++;
            if (charCounts[c] > maxCount || (charCounts[c] == maxCount && result == str.charAt(0))) {
                maxCount = charCounts[c];
                result = c;
            }
        }

        return result;
    }

    public static void main(String[] args) {
       } 
 
}
