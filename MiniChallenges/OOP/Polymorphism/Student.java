package OOP.Polymorphism;

public class Student extends Person {
    private String studentId;
    private double gpa;

    public Student(String name, int age, String studentId, double gpa) {
        super(name, age);
        this.studentId = studentId;
        this.gpa = gpa;
    }


    public String getStudentId() {
        return studentId;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Student ID: " + getStudentId());
        System.out.println("GPA: " + getGpa());
    }

    @Override
    public String getRole(){
        return "Student";
    }
}
