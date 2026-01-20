import java.util.Scanner;

public class Series {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            
            System.out.print("Enter the starting number: ");

            if (!sc.hasNextInt()) {
                System.out.println("Invalid!"); 
                return; 
            }
            int start = sc.nextInt();

           
            System.out.print("Enter the number to add (difference): ");

            if (!sc.hasNextInt()) {
                System.out.println("Invalid!"); 
                return; 
            }

            int diff = sc.nextInt();

            
            System.out.print("Enter the number of terms: ");

            if (!sc.hasNextInt()) {
                System.out.println("Invalid!");
                return;
            }

            int terms = sc.nextInt();

            int currentValue = start;
            
            System.out.print("\nYour Series: ");

            for (int i = 1; i <= terms; i++) {
                
                System.out.print(currentValue + (i == terms ? "" : ", "));
                
                currentValue += diff;
            }
            System.out.println(); 
        }
    }
}