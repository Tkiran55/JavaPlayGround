package BasicJava;

import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Loan Eligibility Checker ===");

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.print("Enter your annual income: ");
        int annualIncome = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Are you employed (yes/no): ");
        String employed = scanner.nextLine();

        boolean isAdult = age>=18;
        boolean hasEnoughIncome = annualIncome >= 25000;
        boolean isEmployed = employed.equals("yes");
        boolean isEligible = isAdult && (hasEnoughIncome || isEmployed);

        System.out.println("=== Results ===");
        System.out.println("Age 18 or older: " + isAdult);
        System.out.println("Income at least 25000: " + hasEnoughIncome);
        System.out.println("Is employed: " + isEmployed );
        System.out.println("Eligible for loan: " + isEligible);

        if (isEligible) {
            System.out.println("Congratulations! You are eligible for a loan.");
        } else {
            System.out.println("Sorry, you are not eligible for a loan.");
        }

        scanner.close();
    }
}
