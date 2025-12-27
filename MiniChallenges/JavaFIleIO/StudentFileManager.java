package JavaFIleIO;

import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class StudentFileManager {

    private Path filePath;

    public StudentFileManager(String filename) {
        this.filePath = Path.of(filename);
    }

    // Save list of students to file
    public void saveStudents(List<Student> students) throws IOException {
        List<String> lines = new ArrayList<>();

        // Header
        lines.add("id,name,grade");

        // Student data
        for (Student s : students) {
            lines.add(s.getId() + "," + s.getName() + "," + s.getGrade());
        }

        Files.write(filePath, lines);
    }

    // Load students from file
    public List<Student> loadStudents() throws IOException {
        List<Student> students = new ArrayList<>();

        if (!fileExists()) {
            return students;
        }

        List<String> lines = Files.readAllLines(filePath);

        // Skip header
        for (int i = 1; i < lines.size(); i++) {
            String[] parts = lines.get(i).split(",");

            String id = parts[0];
            String name = parts[1];
            double grade = Double.parseDouble(parts[2]);

            students.add(new Student(id, name, grade));
        }

        return students;
    }

    // Append single student to file
    public void appendStudent(Student student) throws IOException {
        String line = student.getId() + "," +
                student.getName() + "," +
                student.getGrade() + System.lineSeparator();

        Files.writeString(
                filePath,
                line,
                StandardOpenOption.CREATE,
                StandardOpenOption.APPEND
        );
    }

    // Check if file exists
    public boolean fileExists() {
        return Files.exists(filePath);
    }
}
