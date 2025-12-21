package BasicJava;

public class ArithmeticOperation {
    public static void main(String[] args) {
        int numOne = 24;
        int numTwo = 7;

        int sum = numOne + numTwo;
        int difference = numOne - numTwo;
        int product = numOne * numTwo;
        int quotient = numOne / numTwo;
        int remainder = numOne % numTwo;

        System.out.println("=== Calculator ===");
        System.out.println("Number 1: " + numOne);
        System.out.println("Number 2: " + numTwo);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        int birthYear = 1998;
        int currentYear = 2025;

        int yourAge = currentYear - birthYear;
        System.out.println("Your age: " + yourAge);
    }
}
