package OOP.Encapsulation;

public class Student {
    String name;
    int age;
    char grade;
    double gpa;

    public Student(String name, int age, char grade, double gpa){
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.gpa = gpa;
    }

    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("GPA: " + gpa);
        System.out.println();
    }

    public boolean isPassing(){
        return grade != 'F';
    }

}
