package OOP.Encapsulation;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Java Basics", "John Smith", 350, 29.29);
        Book book2 = new Book("Clean Code",  "Robert Martin", 464,39.99);

        Student student1 = new Student("Kiran", 27, 'A', 3.8);
        Student student2 = new Student("Ram", 22, 'F',1.5);

        System.out.println("=== My Books ===");
        book1.displayInfo();
        book2.displayInfo();

        System.out.println("=== Students ===");
        student1.displayInfo();
        student2.displayInfo();

        System.out.println("=== Passing Status ===");
        System.out.println(student1.name  + " is passing: " + student1.isPassing());
        System.out.println(student2.name  + " is passing: " + student2.isPassing());
    }
}
