import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {

        
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("\n Enter the number : ");
            
            
            if (!sc.hasNextInt()) { 
                System.out.println("Invalid Input! Please enter a number.");
                return; 
            }
            int num = sc.nextInt();

            System.out.println(isPrime(num));
        }
    }

    private static boolean isPrime(int n) {
        
        if (n < 2) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            
            if (n % i == 0) {
                return false; 
            }
        }
        return true; 
    }
}