// Calculation of area of triangle

import java.util.Scanner;

public class AreaCalculation {
    public static void main(String[] args) {

        // Use of try block to auto close the Scanner
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter 3 sides of the triangle:");

            // Validate the input is double

            if (!sc.hasNextDouble()) return;
            double a = sc.nextDouble();

            if (!sc.hasNextDouble()) return;
            double b = sc.nextDouble();

            if (!sc.hasNextDouble()) return;
            double c = sc.nextDouble();

            // Edge Case: Triangle Inequality Theorem (Sum of 2 sides must be > 3rd side)
            if ((a + b <= c) || (a + c <= b) || (b + c <= a)) {
                System.out.println("Error: These sides do not form a valid triangle.");
            } else {
                double s = (a + b + c) / 2.0;
                double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
                System.out.printf("Area: %.2f\n", area);
            }
        }
    }
}