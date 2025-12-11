public class SwapTwoNumbers {
    public static void main(String[] args) {

        int numOne = 30;
        int numTwo = 10;

        //without third variable
        //using operator
        System.out.println("Before Swapping: " + numOne + " " + numTwo);
//        numOne = numOne + numTwo;
//        numTwo = numOne - numTwo;
//        numOne = numOne - numTwo;
//
//        System.out.println("After Swapping: " + numOne + " " + numTwo);
//
        //using Bitwise operator
        numOne = numOne^numTwo;
        numTwo = numOne^numTwo;
        numOne = numOne^numTwo;
        System.out.println("After Swapping: " + numOne + " " + numTwo);
    }
}
