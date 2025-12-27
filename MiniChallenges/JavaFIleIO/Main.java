package JavaFIleIO;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentFileManager fileManager = new StudentFileManager("D:\\Kiran\\JavaPlayGround\\MiniChallenges\\JavaFIleIO\\students.csv");

        // Create some students
        List<Student> students = new ArrayList<>();
        students.add(new Student("S001", "Kiran", 85.5));
        students.add(new Student("S002", "Ram", 92.0));
        students.add(new Student("S003", "Sita", 78.5));

        try {
            // Save to file
            System.out.println("=== Saving Students ===");
            fileManager.saveStudents(students);
            System.out.println("Saved " + students.size() + " students to file.");

            // Load from file
            System.out.println("\n=== Loading Students ===");
            List<Student> loaded = fileManager.loadStudents();
            loaded.forEach(System.out::println);

            // Append new student
            System.out.println("\n=== Appending Student ===");
            fileManager.appendStudent(new Student("S004", "Hari", 88.0));
            System.out.println("Appended new student.");

            // Load again to verify
            System.out.println("\n=== Loading After Append ===");
            List<Student> updated = fileManager.loadStudents();
            updated.forEach(System.out::println);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
