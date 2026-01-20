import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter the first term: ");
            if (!sc.hasNextLong()) {
                return; 
            }
            long num = sc.nextLong();

            System.out.print("Enter common ratio: ");
            if (!sc.hasNextLong()) {
                return; 
            }
            long ratio = sc.nextLong();

            System.out.print("Enter total terms: ");
            if (!sc.hasNextInt()) {
                return; 
            }
            int terms = sc.nextInt();

            long sum = 0; 
            System.out.println("\nSeries:");

            for (int i = 1; i <= terms; i++) {
                System.out.print(num + (i == terms ? "" : ", "));
                
                sum += num;    
                num *= ratio;  
            }

            System.out.println("\n\nTotal Sum of Series: " + sum);
        }
    }
}