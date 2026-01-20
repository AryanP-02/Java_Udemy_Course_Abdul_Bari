import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("\n Enter the number of terms: ");
            
            
            if (!sc.hasNextInt()) { 
                System.out.println("Invalid Input! Please enter a number.");
                return; 
            }
            int terms = sc.nextInt();

            
            int first = 0;
            int second = 1;

            System.out.println("\nGenerated Fibonacci Series:");

            
            for (int i = 1; i <= terms; i++) {
                
                System.out.print(first);

                if (i < terms) {
                    System.out.print(", ");
                }

                int next = first + second;
                
                first = second;
                second = next;
            }
            
            System.out.println();
        }
    }
}