import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num_1;
        double num_2;
        char opr;
        double result = 0;
        boolean valid = true;
        System.out.println("Enter num 1:");
        num_1 = scanner.nextDouble();
        System.out.println("Enter num 2:");
        num_2 = scanner.nextDouble();
        System.out.println("what would you like to do, +, -, *, /");
        opr = scanner.next().charAt(0);

        switch (opr) {
            case '+':
                result = num_1 + num_2;
                break;
            case '-':
                result = num_1 - num_2;
                break;
            case '*':
                result = num_1 * num_2;
                break;
            case '/':
                if (num_2 == 0) {
                    System.out.println("Cannot divide by zero");
                    valid = false;
                } else {
                    result = num_1 / num_2;
                }
                break;
            default:
                System.out.println("that is not the right operator. please enter ALL values correctly");
                valid = false;
        }

        if (valid) {
            System.out.println(result);
        }

        scanner.close();
    }
}