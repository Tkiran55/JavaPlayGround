import java.util.Scanner;

public class StudentGradeManager {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String[] names = {"Kiran", "Ram", "Hari", "Sita", "Gita"};
        int[] scores = {85, 92, 78, 95, 88};

        boolean running = true;

        while(running) {

            displayMenu();
            System.out.print("Enter your choice: " );
            int choice = scanner.nextInt();
            switch (choice){
                case 1 -> displayAllStudents(names, scores);
                case 2 -> System.out.println("Class Average: " + calculateAverage(scores));
                case 3 -> findTopStudent(names, scores);
                case 4 -> displayAllStudentsWithGrades(names, scores);
                case 5 -> {
                    System.out.println("Goodbye!");
                    running =false;
                }
                default -> System.out.println("Invalid choice. Please choose 1-5.");
            }
        }
        scanner.close();
    }

    public static void displayMenu() {
        System.out.println("Student Grade Manager");
        System.out.println("1. View all students");
        System.out.println("2. View class average");
        System.out.println("3. View top student");
        System.out.println("4. View all students with grades");
        System.out.println("5. Exit");


    }

    public static void displayAllStudents(String[] names, int[] scores) {
        System.out.println("=== All Students ===");
        for (int i = 0; i < names.length; i++) {
            System.out.println((i + 1) + ". " + names[i] + " - " + scores[i]);
        }
    }

    public static double calculateAverage(int[] scores){
        int sum = 0;
        for(int score: scores){
            sum += score;
        }
        return (double) sum/ scores.length;
    }

    public static void findTopStudent(String[] names, int[] scores){
        int topScore = scores[0];
        String topStudent = names[0];

        for(int i=0; i<scores.length; i++){
            if(topScore < scores[i]){
                topScore = scores[i];
                topStudent = names[i];
            }

        }
        System.out.println("Top Student: " + topStudent + " (" + topScore + ")");
    }

    public static char getGrade(int score){
        if(score >= 90){
            return 'A';
        } else if (score >= 80) {
            return 'B';
        } else if (score >= 70) {
            return 'C';
        } else if (score >= 60) {
            return 'D';
        }else{
            return 'F';
        }
    }

    public static void displayAllStudentsWithGrades(String[] names, int[] scores){
        System.out.println("=== Students with Grades ===");
        for (int i = 0; i < names.length; i++) {
            System.out.println((i + 1) + ". " + names[i] + " - " + scores[i] + " - " + "Grade: " + getGrade(scores[i]));
        }

    }


}
