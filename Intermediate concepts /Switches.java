import java.util.Scanner;

public class Switches {

    public static void main(String[] args) {
        String day = "Pizza day";
        Scanner scanner = new Scanner(System.in);
        System.out.println("what day of the week is today:");
        day = scanner.nextLine();
        switch (day) {
            case "Monday":
                System.out.println("it's Monday, time to code Java!");
                break;
            case "Tuesday" :
                System.out.println("it's not monday but you still have to code Java");
            default: System.out.println("that's not a day, but did you code Java today!?");
                break;
        }
    }
}