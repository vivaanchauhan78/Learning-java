import java.util.Random;
import java.util.Scanner;

public class Number_gusseing_game {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int guess; 
        int attempts = 0;
        int randomNumber = random.nextInt(100) + 1;
        System.out.println(randomNumber);
        System.out.println("Number guessing game!");
        System.out.println("Guess a number between 1-10:");

        do{
            System.out.println("Enter a guess:");
            guess = scanner.nextInt();
            attempts++;
            if (guess < randomNumber){
                System.out.println(
                    "Too low!"
                );
            }
           else if (guess > randomNumber){
                System.out.println(
                    "Too High!"
                );
            }
        }while(guess != randomNumber); 
        System.out.println("You won!");
        }
    }
    