package ArraysQuestions;

public class SecondLargest {
    public static void main(String[] args) {
        int[] numbers = {12, 35, 1, 10, 34, 1};

        System.out.println(findSecondLargest(numbers));
    }

    public static int findSecondLargest(int[] arr){

        if(arr == null || arr.length <2){
            System.out.println("Array must contain at least two elements.");
            return -1;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int number: arr){
            if(number > largest){
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest && number!= largest) {
                secondLargest = number;
            }
        }

        return secondLargest;
    }
}
