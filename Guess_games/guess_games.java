package Guess_games;
import java.util.*;

public class guess_games {
    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);
        
        // User input
        System.out.println("Please enter a number: ");
        int number = input.nextInt();

        // Generate a randomly
        Random random = new Random();
        int randomNumber = random.nextInt(number) + 1;

        // Output
        System.out.println("Random number between 1 and " + number + ": " + randomNumber);
    }
}
