import java.util.Scanner;

public class Second {
    public static void main(String args[]) {

        try (Scanner sc = new Scanner(System.in)) {
            
            System.out.print("\n Enter number of array elements: ");
            if (!sc.hasNextInt()) return;
            
            int size = sc.nextInt();
            if (size < 2) {
                System.out.println("Array must have at least two elements.");
                return;
            }

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

            int secondIndex = findSecond(A);
            
            if (secondIndex != -1) {
                System.out.println("\n\n The Second Largest element is: " + A[secondIndex] + " found at index: " + secondIndex);
            } else {
                System.out.println("\n\n No distinct second largest element found (all elements might be equal).");
            }
        }
    }

    private static int findSecond(int[] arr) {
        int largest = 0;
        int secondLargest = -1; 
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[largest]) {
                
                secondLargest = largest;
                largest = i; 
            } 
            else if (arr[i] < arr[largest]) {
                
                if (secondLargest == -1 || arr[i] > arr[secondLargest]) {
                    secondLargest = i;
                }
            }
        }
        return secondLargest;
    }
}