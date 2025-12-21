package BasicJava;

import java.util.Scanner;

public class JavaIfElseStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Grade Calculator ===");

        System.out.print("Enter you score (0-100): ");
        int score = scanner.nextInt();

        if(score<0 || score>100){
            System.out.println("Invalid score! Please enter a number between 0 and 100.");
            return;
        }

        System.out.println("=== Results ===");
        System.out.println("Your score: " + score);

        char grade = 0;
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Your grade: " + grade);

        String status = null;
        if (score >= 60) {
            status = "Passed";
        }else{
            status = "Failed";
        }
        System.out.println("Status: " + status);

        scanner.close();
    }
}
