package OOP.Abstraction;

public class Manager extends Employee implements Trainable {
    private int teamSize;

    public Manager(String name, String id, double baseSalary, int teamSize) {
        super(name, id, baseSalary);
        this.teamSize =teamSize;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + (teamSize*100);
    }

    @Override
    public String getRole() {
        return "Manager";
    }

    @Override
    public void attendTraining(String courseName) {
        System.out.println(getName() + " is attending leadership training: " + courseName);
    }

    @Override
    public boolean isEligibleForPromotion() {
        return teamSize>=5;
    }
}
