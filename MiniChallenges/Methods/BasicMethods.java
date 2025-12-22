package Methods;

public class BasicMethods {
    public static void main(String[] args) {
        String name = "Kiran";
        greetUser(name);

        int[] numbers = {23, 45, 12, 67, 34};
        System.out.println("Sum: " + sum(numbers));

        System.out.println("Max: " + max(numbers));
        System.out.println("Is 10 even? " + isEven(10));
        System.out.println("Is 7 even? " + isEven(7));
    }

    public static void greetUser(String name){
        System.out.println("Welcome, " + name);
    }

    public static int sum(int[] arr){
        int sum = 0;
        for(int a: arr){
            sum += a;
        }
        return sum;
    }

    public static int max(int[] arr){
        int max = arr[0];
        for(int a: arr){
            if(a>max){
                max = a;
            }
        }
        return max;
    }

    public static boolean isEven(int number){
        return number % 2 == 0;
    }
}
