import java.util.*;

public class Matrix {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {

            int rows, cols;

            System.out.println("\n Enter number of rows and columns : ");

            if(!sc.hasNextInt()) {return;}
            rows = sc.nextInt();
            cols = sc.nextInt();

            if (rows <= 0 || cols <= 0) {
                System.out.println("Invalid dimensions.");
                return;
            }

            int A[][] = new int[rows][cols];

            System.out.println("\n Enter " + rows * cols + " array elemets : ");
            for (int i = 0; i < rows; i++) {
                for(int j = 0; j < cols; j++) {
                    A[i][j] = sc.nextInt(); 
                }
            }

            System.out.println("\n Array elements are : ");
            for (int i = 0; i < rows; i++) {
                for(int j = 0; j < cols; j++) {
                    System.out.print(A[i][j] + (j < cols - 1 ? "\t":"")); 
                }
                System.out.println("");
            }


        }
    }
}