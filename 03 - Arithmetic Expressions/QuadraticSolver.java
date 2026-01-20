import java.util.Scanner;

public class QuadraticSolver {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter coefficients a, b, and c:");

            if (!sc.hasNextInt()) return;
            int a = sc.nextInt();
            if (a == 0) { System.out.println("Invalid: 'a' cannot be zero."); return; }

            if (!sc.hasNextInt()) return;
            int b = sc.nextInt();
            if (!sc.hasNextInt()) return;
            int c = sc.nextInt();

            double d = (b * b) - (4 * a * c);

            if (d < 0) {
                System.out.println("Roots are imaginary.");
            } else {
                double r1 = (-b + Math.sqrt(d)) / (2 * a);
                double r2 = (-b - Math.sqrt(d)) / (2 * a);
                System.out.printf("Roots: %.2f, %.2f\n", r1, r2);
            }
        }
    }
}