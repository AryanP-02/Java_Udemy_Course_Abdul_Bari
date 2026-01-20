import java.util.Scanner;

public class digits {
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)) {

            System.out.println("\n Enter the number : ");
            int num = sc.nextInt();

            int count = 0;

            while(num > 0) {
                num = num / 10;
                count++;
            }

            System.out.println("\n The total digits are : " + count);
        }
    }
}