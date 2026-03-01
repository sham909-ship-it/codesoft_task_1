import java.util.Scanner;
import java.util.Random;

public class number_guess {
    public static void main(String[] args){
        Random random = new Random();
        int targetNumber = random.nextInt(100)+1;

        Scanner scanner = new Scanner(System.in);

        int guess =0;
        int attempts = 0;

        System.out.println("Hey Player, Welcome to the Number Guessing Game!");
        System.out.println("..................................................");
        System.out.println("Guess any number between 1 and 100.");
        System.out.println("...................................................");
        System.out.println("Pick any number and press enter to submit your guess.");
        while(guess != targetNumber){
            System.out.println("Enter your guess:");
            guess = scanner.nextInt();
            attempts++;
            if(guess > targetNumber){
                System.out.println("Too High! Try again.");
            } else if(guess < targetNumber){
                System.out.println("Too Low! Try again.");
            } else {
                 System.out.println("Congratulations! Your guess is correct!");
                 System.out.println("You guessed the number in "+ attempts +" attempts.");
                 if(attempts <= 5){
                    System.out.println("Excellent! You are a master guesser!");
                 } else if(attempts <= 10){
                    System.out.println("Great job! You are a skilled guesser!");
                 } else if(attempts <= 15){
                    System.out.println("Good effort! You are a decent guesser!");
                 } else {
                    System.out.println("Keep practicing! You can improve your guessing skills!");
                 }
                 }

        }
   scanner.close();}
}
        