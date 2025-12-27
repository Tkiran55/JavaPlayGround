package JavaStreams;

import java.util.*;
import java.util.stream.Collectors;

public class StudentManager {
    private List<Student> students = new ArrayList<>();
    private Map<String, Student> studentMap = new HashMap<>();


    public void addStudent(Student s) {
        students.add(s);
        studentMap.put(s.getId(), s);
    }

    public void removeStudent(String id) {
        Student s = studentMap.remove(id);
        if (s != null) {
            students.remove(s);
        }
    }

    public Student findById(String id) {
        return studentMap.get(id);
    }

    public List<Student> getAllStudents() {
        return students;
    }

    public Student getTopStudent() {
        return students.stream()
                .max(Comparator.comparingDouble(Student::getGrade))
                .orElse(null);
    }

    public double getAverageGrade() {
        return students.stream()
                .mapToDouble(Student::getGrade)
                .average()
                .orElse(0.0);
    }

    public List<Student> getStudentsSortedByGrade(){
        return students.stream()
                .sorted(Comparator.comparingDouble(Student::getGrade).reversed())
                .collect(Collectors.toList());
    }

    public List<Student> getStudentsSortedByName() {
        return students.stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());
    }

    //new stream-based methods

    public List<Student> getStudentsAboveGrade(double threshold) {
        return students.stream()
                .filter(s -> s.getGrade() > threshold)
                .collect(Collectors.toList());
    }

    public List<String> getAllStudentNames(){
        return students.stream()
                .map(Student::getName)
                .collect(Collectors.toList());
    }

    public boolean hasAnyPerfectGrade(){
        return students.stream()
                .anyMatch(s-> s.getGrade() == 100);
    }

    public Map<Character, List<Student>> getStudentsGroupedByGradeLetter() {
        return students.stream()
                .collect(Collectors.groupingBy(s -> {
                    double g = s.getGrade();
                    if (g >= 90) return 'A';
                    if (g >= 80) return 'B';
                    if (g >= 70) return 'C';
                    if (g >= 60) return 'D';
                    return 'F';
                }));
    }

    public String getAllNamesAsString() {
        return students.stream()
                .map(Student::getName)
                .collect(Collectors.joining(", "));
    }

}
