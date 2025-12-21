package OOPs;

public class Student {
    private String name;
    private int age;
    private double gpa;

    Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        displayInfo(true);
    }

    public void displayInfo(boolean showGpa) {
        System.out.println("OOPs.Student Info: ");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        if(showGpa){
        System.out.println("Gpa: " + gpa);
        System.out.println("Honor OOPs.Student: " + (isHonorStudent() ? "Yes" : "No"));
        }else{
            System.out.println("Gpa: [Hidden]" );
        }
    }

    public boolean isHonorStudent() {
        return gpa >= 3.5;
    }

    public void updateGpa(double newGpa) {
        if (newGpa > 0.0 && newGpa < 4.0) {
            gpa = newGpa;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGpa() {
        return gpa;
    }

    //compare gpa with other student
    public void compareGpa(Student other) {
        if (this.gpa > other.gpa) {
            System.out.println(this.name + " has a higher gpa than " + other.name);
        } else if (this.gpa < other.gpa) {
            System.out.println(other.name + " has a higher gpa than " + this.name);
        } else {
            System.out.println("Both have same gpa");
        }
    }


    public static void main(String[] args) {
        Student s1 = new Student("A", 20, 3.6);
        Student s2 = new Student("B", 15, 2.8);
        Student s3 = new Student("C", 22);

        s1.displayInfo();
        s2.displayInfo(false);
        s3.displayInfo();
//            s3.displayInfo();

//            s1.updateGpa(4.1);
//            s1.displayInfo();
        s1.compareGpa(s2);
    }
}
