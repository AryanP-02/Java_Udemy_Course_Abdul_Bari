import java.util.Scanner;

public class Max {
    public static void main(String args[]) {

        try (Scanner sc = new Scanner(System.in)) {
            
            System.out.print("\n Enter number of array elements: ");
            if (!sc.hasNextInt()) return;
            
            int size = sc.nextInt();
            int A[] = new int[size];

            System.out.println("Enter " + size + " array elements:");
            for (int i = 0; i < size; i++) {
                if (!sc.hasNextInt()) return;
                A[i] = sc.nextInt();
            }

            int count = 0;
            System.out.print("\n Array elements are: ");
            for (int x : A) {
                count++;
                System.out.print(x + (count < size ? ", " : ""));
            }

            int maxIndex = findMax(A);
            
            System.out.println("\n\n The Largest element is: " + A[maxIndex] + " found at index: " + maxIndex);
        }
    }

    private static int findMax(int[] arr) {
        int largest = 0; 
        
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[largest]) {
                largest = i; 
            }
        }
        return largest;
    }
}