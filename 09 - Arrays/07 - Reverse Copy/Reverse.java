import java.util.Scanner;

public class Reverse {
    public static void main(String args[]) {

        try (Scanner sc = new Scanner(System.in)) {
            
            System.out.print("\n Enter number of array elements: ");
            if (!sc.hasNextInt()) return;
            
            int size = sc.nextInt();
            if (size < 1) return;

            int A[] = new int[size];
            int B[] = new int[size];

            System.out.println("Enter " + size + " array elements:");
            for (int i = 0; i < size; i++) {
                if (!sc.hasNextInt()) return;
                A[i] = sc.nextInt();
            }

            System.out.print("\n Original array: ");
            for (int i = 0; i < A.length; i++) {
                System.out.print(A[i] + (i < A.length - 1 ? ", " : ""));
            }

            for(int i = 0; i < size; i++) {
                B[i] = A[size - 1 - i];
            }

            System.out.print("\n Reversed array: ");
            for (int i = 0; i < A.length; i++) {
                System.out.print(B[i] + (i < B.length - 1 ? ", " : ""));
            }
            
        }
    }
}