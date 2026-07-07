import java.util.Scanner;

public class temperature_converter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double temp;
        double new_temp;
        String unit;

        System.out.print("Enter the temp: ");
        temp = scanner.nextDouble();

        System.out.println("Do you want to convert to C or F?: ");
        unit = scanner.next().toUpperCase();
        
        new_temp = (unit.equals("C")) ? (temp - 32) * 5/9 : (temp * 9/5) + 32;
        System.out.printf("%.1f°%s",new_temp,unit);
        scanner.close();
    }
}