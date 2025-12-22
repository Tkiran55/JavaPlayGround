package JavaArray;

import java.util.Arrays;

public class BasicArray {
    public static void main(String[] args) {
        String[] favFood = {"Orange", "Banana", "Apple", "Coconut", "Lemon"};

        System.out.println("=== My Favorite Foods ===");
        System.out.println("First: " + favFood[0]);
        System.out.println("Last: " + favFood[4]);
        System.out.println("Total items: " + favFood.length);

        favFood[2] = "Tacos";
        System.out.println("Changed middle item to: " + favFood[2]);
        System.out.print("All foods: " + String.join("," ,favFood));



        System.out.println();

        int[] scores = {85, 92, 78, 95, 88};
        int sum = 0;
        System.out.print("\nScores: ");
        for(int score: scores){
            System.out.print(score + " ");
            sum += score;

        }
        System.out.println("\nSum: " + sum);
        double avg = (double) sum / scores.length;
        System.out.println("Average: " + avg);
    }
}
