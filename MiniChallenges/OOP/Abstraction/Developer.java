package OOP.Abstraction;

public class Developer extends Employee implements Trainable {

    private String programmingLanguage;

    public Developer(String name, String id, double baseSalary, String programmingLanguage) {
        super(name, id, baseSalary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public double calculateSalary() {
        return (getBaseSalary() + 500);
    }


    @Override
    public String getRole() {
        return "Developer";
    }

    @Override
    public void attendTraining(String courseName) {
        System.out.println(getName() + " is learning " + courseName);
    }

    @Override
    public boolean isEligibleForPromotion() {
        return getBaseSalary() > 50000;
    }
}
