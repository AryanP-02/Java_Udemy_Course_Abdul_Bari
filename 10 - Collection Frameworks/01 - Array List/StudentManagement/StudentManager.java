package StudentManagement;

import java.util.ArrayList;

public class StudentManager {

    private ArrayList<Student> students;

    public StudentManager() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("\nStudent " + student.getName() + " added successfully!\n");
    }

    public void removeStudent(int rollNumber) {
        Student s = findStudent(rollNumber);
        if (s != null) {
            students.remove(s);
            System.out.println("\nStudent " + s.getName() + " removed successfully!\n");
        } else {
            System.out.println("\nStudent with roll number " + rollNumber + " not found.\n");
        }
    }

    public Student findStudent(int rollNumber) {
        for (Student s : students) {
            if (s.getRollNumber() == rollNumber)
                return s;
        }
        return null;
    }

    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("\nNo students available.\n");
            return;
        }
        System.out.println("\n=== All Students ===\n");
        for (Student s : students) {
            s.displayStudentInfo();
        }
    }

    public void showTopper() {
        if (students.isEmpty()) {
            System.out.println("\nNo students available.\n");
            return;
        }

        Student topper = students.get(0);
        for (Student s : students) {
            if (s.calculateAverage() > topper.calculateAverage()) {
                topper = s;
            }
        }

        System.out.println("\n=== Topper Student ===\n");
        topper.displayStudentInfo();
    }

    public void failedStudents(int passingMarks) {
        boolean anyFailed = false;
        System.out.println("\n=== Failed Students (Passing Marks: " + passingMarks + ") ===\n");
        for (Student s : students) {
            if (s.calculateAverage() < passingMarks) {
                s.displayStudentInfo();
                anyFailed = true;
            }
        }
        if (!anyFailed)
            System.out.println("No failing students.\n");
    }
}
