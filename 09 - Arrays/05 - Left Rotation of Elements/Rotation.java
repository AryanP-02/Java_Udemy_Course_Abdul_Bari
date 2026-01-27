import java.util.Scanner;

public class Rotation {
    public static void main(String args[]) {

        try (Scanner sc = new Scanner(System.in)) {
            
            System.out.print("\n Enter number of array elements: ");
            if (!sc.hasNextInt()) return;
            
            int size = sc.nextInt();
            if (size < 1) {
                System.out.println("Array cannot be empty.");
                return;
            }

            int A[] = new int[size];

            System.out.println("Enter " + size + " array elements:");
            for (int i = 0; i < size; i++) {
                if (!sc.hasNextInt()) return;
                A[i] = sc.nextInt();
            }

            // Printing original array
            System.out.print("\n Array elements are: ");
            for (int i = 0; i < A.length; i++) {
                System.out.print(A[i] + (i < A.length - 1 ? ", " : ""));
            }

            // --- LEFT ROTATION LOGIC ---
            
            if (size > 1) {
                int temp = A[0]; 

                for (int i = 1; i < A.length; i++) {
                    A[i - 1] = A[i]; 
                }
                A[A.length - 1] = temp; 
            }

           
            System.out.print("\n Left rotated elements are: ");
            for (int i = 0; i < A.length; i++) {
                System.out.print(A[i] + (i < A.length - 1 ? ", " : ""));
            }
            System.out.println();
        }
    }
}