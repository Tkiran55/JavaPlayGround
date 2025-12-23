package OOP.Abstraction;

public abstract class Employee {
    private String name;
    private String id;
    private double baseSalary;


    public Employee(String name, String id, double baseSalary) {
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
    }


    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void displayInfo(){
        System.out.println("Name: " + getName());
        System.out.println("Id: " + getId());
        System.out.println("Base Salary: $" + getBaseSalary());
    }

    public abstract double calculateSalary();

    public abstract String getRole();
}
