import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {

        // Using Try block to auto close the scanner

        try(Scanner sc = new Scanner(System.in)) {

            // 1. Reading a String
            System.out.print("Enter your name: ");
            String name = sc.nextLine();
            System.out.println("Hello, " + name + "!");

            // 2. Reading an integer
            System.out.print("Enter your age: ");
            int age = sc.nextInt();
            System.out.println("You are " + age + " years old.");

            // 3. Reading a double
            System.out.print("Enter your height in meters: ");
            double height = sc.nextDouble();
            System.out.println("Your height is " + height + " meters.");

            // 4. Reading a boolean
            System.out.print("Are you a student? (true/false): ");
            boolean isStudent = sc.nextBoolean();
            System.out.println("Student status: " + isStudent);

            // 5. Reading a single character
            System.out.print("Enter your grade (A/B/C...): ");
            char grade = sc.next().charAt(0); // reads the first character
            System.out.println("Your grade: " + grade);
        }
    }
}
