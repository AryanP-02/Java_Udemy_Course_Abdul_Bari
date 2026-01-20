import java.util.Scanner;

public class CuboidMeasurements {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Length, Breadth, and Height:");

            if (!sc.hasNextInt()) return;
            int l = sc.nextInt();

            if (!sc.hasNextInt()) return;
            int b = sc.nextInt();

            if (!sc.hasNextInt()) return;
            int h = sc.nextInt();

            // Edge Case: Dimensions must be positive
            if (l <= 0 || b <= 0 || h <= 0) {
                System.out.println("Error: Dimensions must be greater than zero.");
            } else {
                int area = 2 * (l * h + b * h + l * b);
                int volume = l * b * h;
                System.out.println("Total Area: " + area);
                System.out.println("Volume: " + volume);
            }
        }
    }
}