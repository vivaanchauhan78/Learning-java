import com.sun.source.tree.IfTree;

import java.util.Random;
import java.util.Scanner;


public class RandomNumberGenrator {
    public static void main(String[] args){
        Random random = new Random();

        int number;
        number = random.nextInt(1,7);
        System.out.println(number);

        System.out.println("do u want to flip a coin? (true/false)");
        Scanner scanner = new Scanner(System.in);
        boolean WantsToFlipCoin = scanner.nextBoolean();
        scanner.close();
        if(WantsToFlipCoin){
            boolean IsHeads = random.nextBoolean();
            if(IsHeads) {
                System.out.println("It's heads");
            }
            else{
                System.out.println("It's tails");
            }
        }
    }
}
