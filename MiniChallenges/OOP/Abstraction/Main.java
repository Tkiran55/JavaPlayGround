package OOP.Abstraction;

public class Main {
    public static void main(String[] args) {
        Employee[] employee = {
                new Developer("Kiran", "D001", 60000, "Java"),
                new Manager("Dr. Smith", "M001", 80000, 8),
                new Developer("Ram", "D002", 45000, "Python")
        };

        System.out.println("=== Employee Report ===");

        for(Employee emp: employee){
            emp.displayInfo();
            System.out.println("Role: " + emp.getRole());
            System.out.println("Total Salary: $" + emp.calculateSalary());

            if(emp instanceof Trainable trainable){
                trainable.attendTraining("Advanced Skills");
                System.out.println("Eligible for Promotion: " + trainable.isEligibleForPromotion());
            }
            System.out.println();
        }
    }
}
