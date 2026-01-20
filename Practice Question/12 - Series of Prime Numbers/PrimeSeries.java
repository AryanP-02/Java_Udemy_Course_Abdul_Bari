import java.util.*;

public class PrimeSeries {
    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in)) {

            System.out.println("\n Enter the number of terms : ");

            if(!sc.hasNextInt()) { return; }
            int terms = sc.nextInt();

            int count = 0;
            int num = 2;

            while(count < terms) {
                if(isPrime(num)) {
                    count++;

                    System.out.print(num + (count == terms ? "":", "));
                }
                num++;
            }
            System.out.println("\n");

        }
    }

    private static boolean isPrime(int n) {

        if(n < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}