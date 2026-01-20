import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("\n Enter the number: ");

            if (!sc.hasNextInt()) {
                System.out.println("Invalid Input!");
                return;
            }

            int num = sc.nextInt();
            
            
            if (num == 0) {
                System.out.println("Zero"); return; 
            }

           
            String s = Integer.toString(Math.abs(num));
            
            if (num < 0) System.out.print("Negative ");

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                
                printDigitAsWord(c);
            }
        }
    }

    
    private static void printDigitAsWord(char c) {
        switch (c) {
            case '0' -> System.out.print("Zero ");
            case '1' -> System.out.print("One ");
            case '2' -> System.out.print("Two ");
            case '3' -> System.out.print("Three ");
            case '4' -> System.out.print("Four ");
            case '5' -> System.out.print("Five ");
            case '6' -> System.out.print("Six ");
            case '7' -> System.out.print("Seven ");
            case '8' -> System.out.print("Eight ");
            case '9' -> System.out.print("Nine ");
        }
    }
}