package ArraysQuestions;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Original Array: " + Arrays.toString(numbers));

        int start = 0;
        int end = numbers.length-1;

        while(start< end){
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }


        System.out.println("Reversed Array: " + Arrays.toString(numbers));
    }
}
