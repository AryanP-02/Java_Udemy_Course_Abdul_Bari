import java.util.*;

public class digits {
    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in)) {

            System.out.println("\n Enter the number : ");
            int num = sc.nextInt();

            System.out.println("\n ");
            
            while(num > 0) {
                int rem = num % 10;
                num = num / 10;
                System.out.println(rem);
            }
        }
    }
}