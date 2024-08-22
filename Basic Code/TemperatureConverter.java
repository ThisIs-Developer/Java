import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in Celsius:");
        double celsius = sc.nextDouble();
        double fahrenheit = (9 * celsius - 160) / 5;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);

        if (fahrenheit > 98.6)
            System.out.println("FEVER");
        else
            System.out.println("No fever");
    }
}
