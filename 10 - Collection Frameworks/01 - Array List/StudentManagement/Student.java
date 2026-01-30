package StudentManagement;

import java.util.ArrayList;
import java.util.Collections;

public class Student {

    private String name;
    private int rollNumber;
    private ArrayList<Integer> marks;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = new ArrayList<>();
    }

    public void addMark(int mark) {
        if (mark >= 0 && mark <= 100) {
            marks.add(mark);
        } else {
            System.out.println("Invalid mark! Must be 0-100.");
        }
    }

    public double calculateAverage() {
        if (marks.isEmpty())
            return 0;
        int sum = 0;
        for (int mark : marks)
            sum += mark;
        return (double) sum / marks.size();
    }

    public int getMin() {
        if (marks.isEmpty())
            return 0;
        return Collections.min(marks);
    }

    public int getMax() {
        if (marks.isEmpty())
            return 0;
        return Collections.max(marks);
    }

    public void displayStudentInfo() {
        System.out.println("========================================");
        System.out.println("Name       : " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks      : " + marks);
        System.out.printf("Average    : %.2f\n", calculateAverage());
        System.out.println("Min Mark   : " + getMin());
        System.out.println("Max Mark   : " + getMax());
        System.out.println("========================================");
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }
}
