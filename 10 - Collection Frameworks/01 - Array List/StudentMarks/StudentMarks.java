import java.util.*;

public class StudentMarks {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            ArrayList<Integer> marks = new ArrayList<>();

            System.out.print("\nEnter the number of students: ");
            int n = scanner.nextInt();

            // Input marks with validation
            for (int i = 0; i < n; i++) {

                System.out.print("\nEnter the marks of student " + (i + 1) + ": ");
                int mark = scanner.nextInt();

                if (mark < 0 || mark > 100) {
                    System.out.println("Invalid marks! Please enter between 0 and 100.");
                    i--;
                    continue;
                }

                marks.add(mark);
            }

            char continueChoice;

            // Menu-driven operations
            do {
                System.out.println("\nEnter your choice:\n");
                System.out.println("1. Display");
                System.out.println("2. Sort");
                System.out.println("3. Get Minimum");
                System.out.println("4. Get Maximum");
                System.out.println("5. Get Average");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1 -> display(marks);
                    case 2 -> sort(marks);
                    case 3 -> getMin(marks);
                    case 4 -> getMax(marks);
                    case 5 -> getAverage(marks);
                    default -> System.out.println("Invalid choice!");
                }

                System.out.print("\nDo you wish to continue? (y/n): ");
                continueChoice = scanner.next().charAt(0);

            } while (continueChoice == 'y' || continueChoice == 'Y');
        }
    }

    // Display marks
    public static void display(ArrayList<Integer> marks) {
        if (marks.isEmpty()) {
            System.out.println("No marks available.");
            return;
        }
        System.out.println("\nDisplaying student marks...");
        System.out.println(marks);
    }

    // Sort marks
    public static void sort(ArrayList<Integer> marks) {
        if (marks.isEmpty()) {
            System.out.println("No marks available.");
            return;
        }
        Collections.sort(marks);
        System.out.println("\nSorted student marks...");
        System.out.println(marks);
    }

    // Minimum marks
    public static void getMin(ArrayList<Integer> marks) {
        if (marks.isEmpty()) {
            System.out.println("No marks available.");
            return;
        }
        int min = Collections.min(marks);
        System.out.println("\nMinimum marks: " + min);
    }

    // Maximum marks
    public static void getMax(ArrayList<Integer> marks) {
        if (marks.isEmpty()) {
            System.out.println("No marks available.");
            return;
        }
        int max = Collections.max(marks);
        System.out.println("\nMaximum marks: " + max);
    }

    // Average marks
    public static void getAverage(ArrayList<Integer> marks) {
        if (marks.isEmpty()) {
            System.out.println("No marks available.");
            return;
        }

        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }

        double average = (double) sum / marks.size();
        System.out.println("\nAverage marks: " + average);
    }
}