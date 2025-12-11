import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        System.out.println("Add Two Numbers");
        Scanner input = new Scanner(System.in);

        int numOne, numTwo;

        System.out.print("Enter First Number: ");
        numOne = input.nextInt();

        System.out.print("Enter Second Number: ");
        numTwo = input.nextInt();

        addTwoNumbers(numOne,numTwo);

    }

    public static void addTwoNumbers(int a, int b){
        int result = a+b;
        System.out.println("Answer: " + result);
    }
}
