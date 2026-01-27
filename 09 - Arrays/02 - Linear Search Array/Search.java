import java.util.*;

public class Search {
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
            
            System.out.println("\n Enter array element to search : ");
            if(!sc.hasNextInt()) {return;}
            int search = sc.nextInt();

            boolean isFound = false;
            int index = 0;
            for (int i = 0; i < size; i++) {
                if(A[i] == search) {
                    isFound = true;
                    index = i;
                    break;
                }
            }

            if(!isFound) {
                System.out.println(" Array element not found !");
            }
            else {
                System.out.println(" Your array element " + search + " was found at index : " + index );
            }
            System.out.println();
        }
    }

  
}