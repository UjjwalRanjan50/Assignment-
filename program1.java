import java.util.Scanner;

public class program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        // Convert to Fahrenheit
        double fahrenheitResult = (celsius * 9 / 5) + 32;

        // Print result
        System.out.println("The " + celsius + " celsius is " + fahrenheitResult + " fahrenheit");

        sc.close();
    }
}
