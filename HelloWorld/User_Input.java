import java.util.Scanner;
public class User_Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scanner.nextInt();
        if (age >= 18){
            System.out.println("you're an adult");
        }
        else if (age <= 18){
            System.out.println("you're an child");
            age++;
        }
        scanner.close();
    }
}