package BasicJava;

import java.util.Scanner;

public class ComparisonOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Number Comparator ===");

        System.out.print("Enter first number: ");
        int numOne = scanner.nextInt();
        System.out.print("Enter second number: ");
        int numTwo = scanner.nextInt();

        System.out.println("\n=== Comparison Results ===");

        System.out.println(numOne + " == " + numTwo + " : " + (numOne == numTwo));
        System.out.println(numOne + " != " + numTwo + " : " + (numOne != numTwo));
        System.out.println(numOne + " > " + numTwo + " : " + (numOne > numTwo));
        System.out.println(numOne + " < " + numTwo + " : " + (numOne < numTwo));
        System.out.println(numOne + " >= " + numTwo + " : " + (numOne >= numTwo));
        System.out.println(numOne + " <= " + numTwo + " : " + (numOne <= numTwo));

        scanner.close();
    }
}
