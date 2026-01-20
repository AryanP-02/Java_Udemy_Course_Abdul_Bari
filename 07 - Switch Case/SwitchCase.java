import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("\n MENU : ");
            System.out.println(" ADD | SUB | MUL | DIV | MOD | EXIT ");
            System.out.print("\n Select your operation (Type the name): ");

            // Use .next() to avoid newline issues and assign the result
            String option = sc.next().toUpperCase();

            if (option.equals("EXIT")) {
                System.out.println(" Thank YOU!");
                return; // Ends the program early
            }

            System.out.print(" Enter first number: ");
            int a = sc.nextInt();
            System.out.print(" Enter second number: ");
            int b = sc.nextInt();

            switch(option) {
                case "ADD" -> System.out.println("\n Sum: " + (a + b));

                case "SUB" -> System.out.println("\n Difference: " + (a - b));

                case "MUL" -> System.out.println("\n Product: " + (a * b));

                case "DIV" -> {
                    
                    if (b != 0) {
                        System.out.println("\n Quotient: " + (a / b));
                    } else {
                        System.out.println("\n Error: Cannot divide by zero!");
                    }
                }

                case "MOD" -> System.out.println("\n Remainder: " + (a % b));
                    
                default -> System.out.println("\n Invalid Choice!");
            }
        } 
    }
}