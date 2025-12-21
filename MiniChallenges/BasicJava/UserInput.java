package BasicJava;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Profile Builder ===");

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your birth year: ");
        int birthYear = scanner.nextInt();

        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();

        System.out.println("\n=== Your Profile ===");
        System.out.println("Name: " + name);
        System.out.println("Birth Year: " + birthYear);

        int currentYear = 2025;
        int age = currentYear - birthYear;
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " meters");

        scanner.close();
    }
}
