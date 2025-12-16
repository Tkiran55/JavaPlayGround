package ArraysQuestions;

public class ContainsASpecificValue {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        int valueToFind = 40;
        int missingValue = 99;

        System.out.println(contains(numbers, valueToFind));
        System.out.println(contains(numbers, missingValue));


    }

    public static boolean contains(int[] numbers, int targetValue){
        for(int number: numbers){
            if(number == targetValue){
                return true;
            }
        }
        return false;
    }
}
