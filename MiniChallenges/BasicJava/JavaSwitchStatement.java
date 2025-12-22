package BasicJava;

import java.util.Scanner;

public class JavaSwitchStatement {
    public static void main(String[] args) {
        System.out.println("=== Main Menu ===");
        System.out.println("1. View Profile");
        System.out.println("2. Edit Settings");
        System.out.println("3. Help");
        System.out.println("4. Exit");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1 -> {
                System.out.println("You selected: View Profile");
                System.out.println("Opening view profile...");
            }
            case 2 -> {
                System.out.println("You selected:Edit Settings ");
                System.out.println("Opening settings panel...");
            }
            case 3 -> {
                System.out.println("You selected: Help");
                System.out.println("Opening help...");
            }
            case 4 -> System.out.println("Goodbye!");
            default -> System.out.println("Invalid choice. Please select 1-4.");

        }

        scanner.close();
    }
}
