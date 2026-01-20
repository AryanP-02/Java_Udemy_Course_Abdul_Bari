import java.util.Scanner;

public class armstrong {

    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)) {

            System.out.println("\n Armstrong Number Checker");
            System.out.println("\n\n Enter the number : ");

            if(!sc.hasNextInt()) {
                System.out.println("\n Invalid Input !");
            }
            else {
                int num = sc.nextInt();

                if(isArmstrong(num)) {
                    System.out.println("\n " + num + " is an Armstrong number!");
                }
                else {
                    System.out.println("\n " + num + " is NOT an Armstrong number!");
                }
            }
        }
    }
    
    // Check Armstrong
    private static boolean isArmstrong(int n) {
        if(n < 0) {
            return false;
        }
        int original = n;
        int count = getDigitCount(n);

        int sum = 0;

            while(n > 0) {
                int digit = n % 10;
                sum += power(digit, count);
                n = n / 10;
            }

            return sum == original;
    }
           
    // Count the Digits of number
    private static int getDigitCount(int n) {

        if(n == 0) {
            return 1;
        }

        int count = 0;

        while(n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }    

    // Calculate the power
    private static int power(int base, int exp) {
        int result = 1;

        for (int i = 0; i < exp; i++) {
            result *= base;
        }
        return result;
    }
}        

