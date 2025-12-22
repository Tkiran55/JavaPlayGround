package OOP;

public class Student {
    private String name;
    private int age;
    private char grade;
    private double gpa;

    public Student(String name, int age, char grade, double gpa) {
        this.name = name;
        setAge(age);
        setGpa(gpa);
        setGrade(grade);

        //Better approach — reuse your setters in the constructor:
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("GPA: " + gpa);
        System.out.println();
    }

    public boolean isPassing() {
        return grade != 'F';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("Invalid age! Must be between 0 and 120.");
        }

    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {


        if (grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'E' || grade == 'F') {
            this.grade = grade;

        } else {
            System.out.println("Invalid grade! Must be A, B, C, D, or F.");
        }

    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        if (gpa >= 0.0 && gpa <= 4.0) {
            this.gpa = gpa;
        } else {
            System.out.println("Invalid GPA! Must be between 0.0 and 4.0.");
        }
    }
}
