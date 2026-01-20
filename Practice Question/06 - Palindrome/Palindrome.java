import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("--- Palindrome Checker ---");
            System.out.print("Enter a number or word: ");

            String original = sc.next();

            if (isPalindrome(original)) {

                System.out.println("\n SUCCESS: '" + original + "' is a Palindrome!");
            } 
            else {
                
                System.out.println("\n FAILED: '" + original + "' is NOT a Palindrome.");
            }
        }
    }

    
    public static boolean isPalindrome(String str) {
        
        String cleanStr = str.toLowerCase();

        StringBuilder sb = new StringBuilder(cleanStr);

        String reversed = sb.reverse().toString();

        return cleanStr.equals(reversed);
    }
}