package BasicJava;

import java.util.Scanner;

public class JavaBreakContinue {
    public static void main(String[] args) {
        System.out.println("Searching for the number divisible by both 3 and 7...");
        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0 && i % 7 == 0) {
                System.out.println("Found: " + i);
                break;
            }
        }

        System.out.println("Skip all multiples of 3");
        for (int i = 1; i <= 15; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n=== Sum Until 100 ===");

        int sum = 0;
        while (true) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            sum += number;

            System.out.println("Current sum: " + sum);
            if(sum>=100){
                System.out.println("Sum exceeded 100! Stopping");
                break;
            }
        }

    }
}
