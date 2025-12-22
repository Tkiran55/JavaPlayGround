package OOP;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Java Basics", "John Smith", 350, 29.29);
        Book book2 = new Book("Clean Code",  "Robert Martin", 464,39.99);

        book1.setPrice(0);
        Student student1 = new Student("Kiran", 27, 'A', 3.8);
        Student student2 = new Student("Ram", 22, 'F',1.5);

        Student student = new Student("Kiran", 27, 'A', 3.8);
        student.setAge(-5);      // Should show error
        student.setGpa(5.0);     // Should show error
        student.setGrade('Z');   // Should show error
        System.out.println("Age: " + student.getAge());


        System.out.println("=== My Books ===");
        book1.displayInfo();
        book2.displayInfo();

        System.out.println("=== Students ===");
        student1.displayInfo();
        student2.displayInfo();

        System.out.println("=== Passing Status ===");
        System.out.println(student1.getName()  + " is passing: " + student1.isPassing());
        System.out.println(student2.getName()  + " is passing: " + student2.isPassing());
    }

}
