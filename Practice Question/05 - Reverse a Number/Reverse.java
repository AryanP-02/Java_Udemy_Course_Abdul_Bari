import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");

            if (!sc.hasNextInt()) {
                System.out.println("Invalid Input!");
            } 
            else {
                int num = sc.nextInt();
                
                String reverseResult = reverseMathToString(num);

                System.out.println("Original: " + num);
                System.out.println("Reversed: " + reverseResult);
            }
        }
    }

    private static String reverseMathToString(int n) {
        
        if (n == 0) return "0";

        StringBuilder sb = new StringBuilder();
        
        // Handle negative sign visually
        boolean isNegative = n < 0;
        if (isNegative) {
            n = Math.abs(n); 
        }

        while (n > 0) {
            int digit = n % 10;   
            sb.append(digit);      
            n /= 10;               
        }

        if (isNegative) {
            return "-" + sb.toString();
        }

        return sb.toString();
    }
}