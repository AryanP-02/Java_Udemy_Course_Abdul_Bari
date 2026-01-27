import java.util.*;

public class Array {
    public static void main(String args[]) {

        try(Scanner sc = new Scanner(System.in)) {
            
            System.out.println("\n Enter number of array elements : ");
            if(!sc.hasNextInt()) {
                return;
            }
            int size = sc.nextInt();
            int A[] = new int[size];

            System.out.println("\n Enter " + size + " array elements : ");
            for (int i = 0; i < size; i++) {

                if(!sc.hasNextInt()) { return;}
                A[i] = sc.nextInt();
            }

            int count = 0;
           
            System.out.println("\n Array elements are : ");
            for(int x : A) {
                count++;
                System.out.print(" " + x + (count < size ? ", " : ""));
            }
            
            int sum = calculateSum(A);
            System.out.println("\n Sum of all elements : " + sum);
            System.out.println();
        }
    }

    private static int calculateSum(int[] arr) {
        int sum = 0;
        for(int x : arr) {
            sum += x;
        }
        return sum;
    }
}