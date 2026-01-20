import java.util.Scanner;

public class GradeSystem {
    public static void main(String[] args) {
        // Try-with-resources: No 'catch' or 'finally' needed to close the scanner
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter Exam Score: ");

            // Check if the input is actually an integer before reading it
            if (scanner.hasNextInt()) {
                int score = scanner.nextInt();

                System.out.println("Exam Score: " + score);

                if (score >= 90) {
                    System.out.println("Grade: A - Excellent!");
                } else if (score >= 80) {
                    System.out.println("Grade: B - Well done.");
                } else if (score >= 70) {
                    System.out.println("Grade: C - Keep improving.");
                } else {
                    System.out.println("Grade: F - Please retake the exam.");
                }
            } else {
                System.out.println("Error: That is not a valid number.");
            }
        } // The scanner is automatically closed here
    }
}