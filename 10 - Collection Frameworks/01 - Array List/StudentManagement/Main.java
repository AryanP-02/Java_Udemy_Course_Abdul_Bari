package StudentManagement;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StudentManager manager = new StudentManager();
        char continueChoice;

        System.out.println("========================================");
        System.out.println("  Welcome to Student Management System  ");
        System.out.println("========================================");

        do {
            System.out.println("\n--- Menu ---\n");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Add Marks to Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Show Topper");
            System.out.println("6. Show Failed Students");
            System.out.println("0. Exit");
            System.out.print("\n Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> {
                    System.out.print("\nEnter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter roll number: ");
                    int rollNumber = scanner.nextInt();
                    scanner.nextLine();
                    manager.addStudent(new Student(name, rollNumber));
                }
                case 2 -> {
                    System.out.print("\nEnter roll number to remove: ");
                    int rollNumber = scanner.nextInt();
                    manager.removeStudent(rollNumber);
                }
                case 3 -> {
                    System.out.print("\nEnter roll number to add marks: ");
                    int rollNumber = scanner.nextInt();
                    Student s = manager.findStudent(rollNumber);
                    if (s != null) {
                        System.out.print("Enter marks (0-100): ");
                        int mark = scanner.nextInt();
                        s.addMark(mark);
                        System.out.println("\nMarks added successfully!\n");
                    } else {
                        System.out.println("\nStudent not found.\n");
                    }
                }
                case 4 -> manager.displayAllStudents();
                case 5 -> manager.showTopper();
                case 6 -> {
                    System.out.print("\nEnter passing marks: ");
                    int passingMarks = scanner.nextInt();
                    manager.failedStudents(passingMarks);
                }
                case 0 -> System.out.println("\nExiting program...");
                default -> System.out.println("\nInvalid choice! Please try again.\n");
            }

            if (choice != 0) {
                System.out.print("\nDo you wish to continue? (y/n): ");
                continueChoice = scanner.next().charAt(0);
            } else
                break;

        } while (continueChoice == 'y' || continueChoice == 'Y');

        scanner.close();
        System.out.println("\n========================================");
        System.out.println("  Thank you for using the system!       ");
        System.out.println("========================================\n");
    }
}
