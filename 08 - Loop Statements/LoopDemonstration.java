import java.util.Scanner;

public class LoopDemonstration {
    public static void main(String[] args) {
        // Try-with-resources ensures the scanner closes automatically
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("How many times should we process? (Enter a number): ");

            if (input.hasNextInt()) {
                int limit = input.nextInt();

                // 1. STANDARD FOR LOOP (Good for fixed ranges)
                System.out.println("\n--- Standard For Loop ---");
                for (int i = 1; i <= limit; i++) {
                    System.out.println("Iteration: " + i);
                }

                // 2. WHILE LOOP (Good for logic-based conditions)
                System.out.println("\n--- While Loop ---");
                int count = 1;
                while (count <= limit) {
                    System.out.println("Processing step: " + count);
                    count++;
                }

                // 3. DO-WHILE LOOP (Runs at least once)
                System.out.println("\n--- Do-While Loop ---");
                int j = 1;
                if (limit > 0) { // Safety check for green logic
                    do {
                        System.out.println("Executing safety check: " + j);
                        j++;
                    } while (j <= limit);
                }

            } else {
                System.out.println("Invalid input. Please enter an integer next time.");
            }
        }
        // No 'catch' needed if we just want the auto-close functionality
    }
}