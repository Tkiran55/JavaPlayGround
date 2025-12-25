package JavaException;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

// Test divide
        try {
            System.out.println("10 / 2 = " + calc.divide(10, 2));
            System.out.println("10 / 0 = " + calc.divide(10, 0));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

// Test squareRoot
        try {
            System.out.println("√16 = " + calc.squareRoot(16));
            System.out.println("√-4 = " + calc.squareRoot(-4));
        } catch (InvalidInputException e) {
            System.out.println("Error: " + e.getMessage());
        }

// Test parseNumber
        try {
            System.out.println("Parsed: " + calc.parseNumber("123"));
            System.out.println("Parsed: " + calc.parseNumber("abc"));
        } catch (NumberFormatException e) {
            System.out.println("Error: Cannot parse 'abc' as number");
        }

// Test factorial
        try {
            System.out.println("5! = " + calc.factorial(5));
            System.out.println("-3! = " + calc.factorial(-3));
        } catch (InvalidInputException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
