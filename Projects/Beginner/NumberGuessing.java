
import java.util.Scanner;

public class NumberGuessing {

    private static final Scanner sc = new Scanner(System.in);
    private static final int max = 100;
    private static final int min = 1;

    public static void main(String[] args) {

    mainMenu();

    }

    public static void mainMenu(){
        System.out.println("Welcome to Number Guessing Game");
        System.out.printf("Guess a number between %d to %d\n", min, max);
        System.out.println();

        System.out.println("1. Easy (10 chances)");
        System.out.println("2. Medium (5 chances)");
        System.out.println("3. Hard (3 chances)");
        System.out.println("4. Exit");
        System.out.println("---------------------------------------");
        gameMode();
    }

    public static void gameMode(){
        System.out.print("Choose a difficulty level: ");
        int levelChosen = sc.nextInt();

        switch(levelChosen){

            case 1 -> easyMode();
            case 2 -> System.out.println("Medium"); //coming soon
            case 3 -> System.out.println("Hard"); //coming soon
            case 4 -> System.out.println("BYE!!!!!");
            default -> System.out.println("Error: Wrong input");
        }
    }

    public static void easyMode(){
        System.out.println("You have chosen Easy Mode.");

        //Random number
        int randomNumber = (int) (Math.random()*(max-min+1)) + min;
        System.out.println(randomNumber);

        int attempts = 0;

        while(attempts<10) {
        System.out.print("Enter you guess: ");
        attempts++;
        int userGuess = sc.nextInt();

            if(userGuess == randomNumber){
                System.out.println("Congratulation! You have guessed the number in " + attempts + " attempts.");
                break;
            }else if (userGuess > randomNumber){
                System.out.println("The number is lesser than you guess");
            }else{
                System.out.println("The number is greater than you think");
            }

        }
        sc.nextLine();
        System.out.print("You want to play again? (Y/N): ");
        String playAgain = sc.nextLine().toLowerCase();

        if(playAgain.equals("y")){
            easyMode();
        }else{
            System.out.println("Thanks for playing.");
            System.out.println("Loading...............................");
            System.out.println();
            mainMenu();
        }

    }
    
}