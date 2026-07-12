import java.util.Scanner;

public class Bank {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double balance = 0;
        boolean isRunning = true;
        int choice;

        while (isRunning) {
            System.out.println("Banking program");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    showBalance(balance); 
                    break;
                case 2:
                    balance += deposit();
                    System.out.println("Deposited");
                    showBalance(balance);
                    break;
                case 3:
                    balance = Withdraw(balance);
                    showBalance(balance);
                    break;
                case 4:
                    isRunning = false;
                    break;
                default:
                    System.out.println("That's not a valid choice");
            }
            System.out.println();
        }
        scanner.close();
    }
    static void showBalance(double balance){
        System.out.printf("Your Balance currently is: $%.2f\n", balance);
    }
    static double deposit(){
        double amount = 0;

        System.out.println("How much do you want to deposit?: ");
        amount = scanner.nextDouble();
        return amount;
    }
    static double Withdraw(double balance){
        double amount;
        System.out.print("How much would you like to withdraw?: ");
        amount = scanner.nextDouble();
        if (balance - amount < 0) {
            System.out.println("You can't withdraw more money than you have currently");
        } else {
            balance -= amount;
            System.out.printf("Withdrawn: $%.2f\n", amount);
        }
        return balance;
    }
}
