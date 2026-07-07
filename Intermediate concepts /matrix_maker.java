import java.util.Scanner;

public class matrix_maker {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
    
        int rows;
        int columns;
        char symbol;
        System.out.println("how many rows #:");
        rows = scanner.nextInt();
        System.out.println("how many columns #:");
        columns = scanner.nextInt();
        System.out.println("what character? :");
        symbol = scanner.next().charAt(0);

        for(int i = 0; i < rows; i++){
            for(int j = 0;j < columns; j++){
                System.out.print(symbol);
            }
            System.out.println();
        }
        scanner.close();
        }
    }