public class Student {
    String name;
    int age;
    double gpa;

    Student(String name, int age, double gpa){
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public void displayInfo(){
        System.out.println("Student Info: ");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gpa: " + gpa);
        System.out.println(isHonorStudent());
    }

    public boolean isHonorStudent(){
        return gpa >= 3.5;
    }

    public static void main(String[] args) {
        Student s1= new Student("A" ,20, 3.6);
        Student s2= new Student("B" ,15, 2.8);
        Student s3= new Student("C" ,22, 2.1);

        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();
    }
}
