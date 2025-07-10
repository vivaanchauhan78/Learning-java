import java.util.Objects;
import java.util.Scanner;
import java.util.function.Function;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double result;
        System.out.println("what operation would u like to do? for Multiplication type *, for Division type /, for Addition type +, for Subtraction type -");
        String opration = scanner.next();

        if(Objects.equals(opration, "-")) {
            System.out.println("what is the first number?");
            int Number1 = scanner.nextInt();
            System.out.println("what is the second number?");
            int Number2 = scanner.nextInt();
            result = Math.subtractExact(Number1, Number2);
            System.out.println("here is your result" + result);
        } else if (Objects.equals(opration, "+")) {
            System.out.println("what is the first number?");
            int Number1 = scanner.nextInt();
            System.out.println("what is the second number?");
            int Number2 = scanner.nextInt();
            result = Math.addExact(Number1, Number2);
            System.out.println("here is your result " + result);
        } else if (Objects.equals(opration,"/")) {
            System.out.println("what is the first number ?");
            int Number1 = scanner.nextInt();
            System.out.println("what is the second number?");
            int Number2 = scanner.nextInt();
            result = Math.floorDiv(Number1,Number2);
            System.out.println("Here is your result "+ result);
        } else if (Objects.equals(opration, "*")) {
            System.out.println("What is the first number?");
            int Number1 = scanner.nextInt();
            System.out.println("what is the Second number?");
            int Number2 = scanner.nextInt();
            result = Math.multiplyExact(Number1,Number2);
            System.out.println("Here is your output "+ result);
        }
    }
}
