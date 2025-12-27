package JavaStreams;

public class Main {
    public static void main(String[] args) {

        StudentManager manager = new StudentManager();

        manager.addStudent(new Student("S001", "Kiran", 85.5));
        manager.addStudent(new Student("S002", "Ram", 92.0));
        manager.addStudent(new Student("S003", "Sita", 78.5));
        manager.addStudent(new Student("S004", "Hari", 92.0));
        manager.addStudent(new Student("S005", "Gita", 88.0));

        System.out.println("=== All Students ===");
        for (Student s : manager.getAllStudents()) {
            System.out.println(s);
        }

        System.out.println("\n=== Find by ID ===");
        System.out.println(manager.findById("S002"));

        System.out.println("\n=== Top Student ===");
        System.out.println(manager.getTopStudent());

        System.out.println("\n=== Average Grade ===");
        System.out.println("Average: " + manager.getAverageGrade());

        System.out.println("\n=== Sorted by Grade (Descending) ===");
        for (Student s : manager.getStudentsSortedByGrade()) {
            System.out.println(s);
        }

        System.out.println("\n=== Sorted by Name ===");
        for (Student s : manager.getStudentsSortedByName()) {
            System.out.println(s);
        }

        System.out.println("\n=== Students Above 85 ===");
        manager.getStudentsAboveGrade(85).forEach(System.out::println);

        System.out.println("\n=== All Names ===");
        System.out.println(manager.getAllStudentNames());

        System.out.println("\n=== Any Perfect Grade? ===");
        System.out.println(manager.hasAnyPerfectGrade());

        System.out.println("\n=== Names as String ===");
        System.out.println(manager.getAllNamesAsString());

        System.out.println("\n=== Grouped by Grade Letter ===");
        manager.getStudentsGroupedByGradeLetter()
                .forEach((letter, list) -> {
                    System.out.println(letter + ": " + list);
                });

    }
}
