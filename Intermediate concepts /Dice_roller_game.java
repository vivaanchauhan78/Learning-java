import java.util.Random;
import java.util.Scanner;

public class Dice_roller_game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numofDice;
        int total = 0;
        System.out.println("************************************");
        System.out.println("enter how many dice u want to roll: ");
        System.out.println("************************************");
        numofDice = scanner.nextInt();
        if (numofDice > 0 && numofDice <101){
            for(int i = 0;i < numofDice;i++){
                int amount;
                amount = random.nextInt(6)+1;
                System.out.println(amount);
                System.out.println("");
                total += amount;
            }
        }
        else{
            System.out.println("you can't roll less then 1 dice at a time.");
        }
        scanner.close();
        System.out.printf("You rolled a total of %d die ",numofDice);
        System.out.println("");
        System.out.println("Your total is " + total);
        }
}