package OOP.Inheritance;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Kiran", 27, "S001", 3.8);
        Teacher teacher = new Teacher("Dr. Smith", 45, "T001", "Java Programming");

        student.displayInfo();
        System.out.println();
        teacher.displayInfo();
        teacher.teach();
    }
}
