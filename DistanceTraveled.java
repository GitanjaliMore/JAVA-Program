package homework;

import java.util.Scanner;

public class DistanceTraveled {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Constants
        double u = 10; // Initial velocity in m/s (converted from 36 km/h)
        double a = 5;  // Acceleration in m/s²

        // Read input until no more lines are given
        while (scanner.hasNext()) {
            int t = scanner.nextInt();  // Time duration in seconds

            // Calculate the distance using the formula
            double distance = u * t + (a * t * t) / 2;

            // Print the result
            System.out.println((int) distance);  // Print as integer (distance in meters)
        }
        
        scanner.close();
    }
}
