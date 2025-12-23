package OOP.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Person[] members = {
                new Student("Kiran", 27, "S001", 3.8),
                new Teacher("Dr. Smith", 45, "T001", "Java"),
                new Student("Ram", 22, "S002", 3.5),
                new Teacher("Prof. Jones", 50, "T002", "Python"),
                new Student("Sita", 20, "S003", 3.9)
        };

        School school = new School(members);

        System.out.println("=== All Members ===");
        school.listAllMembers();

        System.out.println("\nTotal Students: " + school.countStudents());
        System.out.println("Total Teachers: " + school.countTeachers());

        Person found = school.findByName("Ram");
        if(found !=null){
            System.out.println("\nFound: " + found.getName() + " (" + found.getRole() + ")");
        }
    }
}
