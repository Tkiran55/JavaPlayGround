package ArraysQuestions;

public class AverageOfArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        int sum=0;


        for(int number: numbers){
            sum += number;
        }

        double avg = (double) sum/ numbers.length;
        System.out.println("Average of Array of numbers: " + avg);
    }
}
