
public class Practice {
    public static void main(String[] args) {
        //question1
        String name = "Kiran";
        int age = 28;

        //question2
        int birthYear = 1998;
        double height = 4.9; //in meter
        char firstLetter = 'K';
        boolean likeCoffee = true;

        System.out.println("BirthYear: " + birthYear + "Height: " + height + "First Letter: " + firstLetter + "Do you like coffee?: " + likeCoffee);

        //question3
        int numOne = 11;
        int numTwo = 3;

        int sum = numOne + numTwo;
        int difference = numOne - numTwo;


        int product = numOne * numTwo;


        int quotient = numOne / numTwo;

        int remainder = numOne % numTwo;


        if(numOne%2 == 0) {
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }

        System.out.println(sum);
        System.out.println(difference);
        System.out.println(product);
        System.out.println(quotient);
        System.out.println(remainder);

    }

}


