import java.util.Scanner;
public class MadLibGame    {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        String AdjectiveNumber1; //an adjective describes something
        String AdjectiveNumber2; //an adjective describes something
        String AdjectiveNumber3; //an adjective describes something
        String verbNumber1; //A verb is an action
        String verbNumber2; //A verb is an action
        String verbNumber3; //A verb is an action
        String AnimalNumber1;
        String AnimalNumber2;


        System.out.println("enter a adjective");
        AdjectiveNumber1 = scanner.nextLine();
        System.out.println("enter a verb");
        verbNumber1 = scanner.nextLine();
        System.out.println("enter a animal");
        AnimalNumber2 = scanner.nextLine();
        System.out.println("enter a verb");
        verbNumber2 = scanner.nextLine();
        System.out.println("enter a adjective");
        AdjectiveNumber2 = scanner.nextLine();
        System.out.println("enter a Animal");
        AnimalNumber1 = scanner.nextLine();
        System.out.println("enter a adjective");
        AdjectiveNumber3 = scanner.nextLine();
        System.out.println("enter a verb");
        verbNumber3 = scanner.nextLine();
        System.out.println("\nToday I want to the zoo there I saw a " +AnimalNumber1);
        System.out.println("The "+AnimalNumber1 +" was really "+ AdjectiveNumber1 );
        System.out.println("after that I wanted to " + verbNumber1 + " and I saw a "+ AnimalNumber2 +" it was escaping the zoo");
        System.out.println("I started to " + verbNumber2+" the " +AnimalNumber2+","+ AnimalNumber2+    " was" + AdjectiveNumber2);
        System.out.println("at the end I "+verbNumber3+" even tho "+ AnimalNumber2+" was " +AdjectiveNumber3);
        scanner.close();
    }
}
