package ArraysQuestions;

public class MinAndMaxElement {
    public static void main(String[] args) {
        int[] numbers = {20, 10, 50, 40, 30 ,80 ,70, 60, 90};

        int min = numbers[0];
        int max = numbers[0];

        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }

        System.out.println("Minimum Element: " + min);
        System.out.println("Maximum Element: "+ max);
    }
}
