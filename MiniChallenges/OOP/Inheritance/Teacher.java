package OOP.Inheritance;

public class Teacher extends Person{

    private String employeeId;
    private String subject;

    public Teacher(String name, int age, String employeeId, String subject) {
        super(name, age);
        this.employeeId = employeeId;
        this.subject = subject;
    }


    public String getEmployeeId() {
        return employeeId;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Employee ID: " + getEmployeeId());
        System.out.println("Subject: " + getSubject());
    }

    public void teach(){
        System.out.println(getName() + " is teaching " + getSubject() + ".");
    }

}
