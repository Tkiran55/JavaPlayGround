package JavaException;

public class Calculator {
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero!");
        }
        return a / b;
    }

    public double squareRoot(double num) throws InvalidInputException {
        if (num < 0) {
            throw new InvalidInputException("Cannot calculate square root of negative number!");
        }
        return Math.sqrt(num);
    }

    public int parseNumber(String str) {
        return Integer.parseInt(str);
    }

    public int factorial(int n) throws InvalidInputException {
        if (n < 0) {
            throw new InvalidInputException("Factorial not defined for negative numbers!");
        }
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
