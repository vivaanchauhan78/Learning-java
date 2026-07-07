import java.util.Scanner;

public class Compound_interest_calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double p;
        double rate;
        int timesCompounded; 
        int years;
        double amount;
        System.out.println("principal amount:");
        p = scanner.nextDouble();
        System.out.println("what is the interest rate");
        rate = scanner.nextDouble()/100;
        System.out.println("how many times copounded per year");
        timesCompounded = scanner.nextInt();
        System.out.println("enter the number of years: ");
        years  = scanner.nextInt();

        amount = p * Math.pow(1 + rate / timesCompounded, timesCompounded * years);
        System.out.printf("your total come to %.2f", amount);
        scanner.close(); 
    }
}
