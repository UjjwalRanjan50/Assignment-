import java.util.Scanner;

public class program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        // Convert to Celsius
        double celsiusResult = (fahrenheit - 32) * 5 / 9;

        // Print result
        System.out.println("The " + fahrenheit + " fahrenheit is " + celsiusResult + " celsius");

        sc.close();
    }
}
