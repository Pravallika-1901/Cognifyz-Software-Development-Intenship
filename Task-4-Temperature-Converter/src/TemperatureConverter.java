import java.util.*;

public class TemperatureConverter {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n=====================================");
            System.out.println("      TEMPERATURE CONVERTER");
            System.out.println("=====================================");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("3. Celsius to Kelvin");
            System.out.println("4. Kelvin to Celsius");
            System.out.println("5. Fahrenheit to Kelvin");
            System.out.println("6. Kelvin to Fahrenheit");
            System.out.println("7. Exit");
            System.out.print("\nEnter your choice: ");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    celsiusToFahrenheit();
                    break;
                case 2:
                    fahrenheitToCelsius();
                    break;
                case 3:
                    celsiusToKelvin();
                    break;
                case 4:
                    kelvinToCelsius();
                    break;
                case 5:
                    fahrenheitToKelvin();
                    break;
                case 6:
                    kelvinToFahrenheit();
                    break;
                case 7:
                    System.out.println("\nThank you for using Temperature Converter.");
                    break;
                default:
                    System.out.println("\nInvalid Choice!");
            }
        } while(choice != 7);
        sc.close();
    }
    public static void celsiusToFahrenheit() {
        System.out.print("\nEnter Temperature in Celsius: ");
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("\nTemperature in Fahrenheit: " + fahrenheit + " °F");
    }
    public static void fahrenheitToCelsius() {
        System.out.print("\nEnter Temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("\nTemperature in Celsius: " + celsius + " °C");
    }
    public static void celsiusToKelvin() {
        System.out.print("\nEnter Temperature in Celsius: ");
        double celsius = sc.nextDouble();
        double kelvin = celsius + 273.15;
        System.out.println("\nTemperature in Kelvin: " + kelvin + " K");
    }
    public static void kelvinToCelsius() {
        System.out.print("\nEnter Temperature in Kelvin: ");
        double kelvin = sc.nextDouble();
        double celsius = kelvin - 273.15;
        System.out.println("\nTemperature in Celsius: " + celsius + " °C");
    }
    public static void fahrenheitToKelvin() {
        System.out.print("\nEnter Temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        double kelvin = (fahrenheit - 32) * 5 / 9 + 273.15;
        System.out.println("\nTemperature in Kelvin: " + kelvin + " K");
    }
    public static void kelvinToFahrenheit() {
        System.out.print("\nEnter Temperature in Kelvin: ");
        double kelvin = sc.nextDouble();
        double fahrenheit = (kelvin - 273.15) * 9 / 5 + 32;
        System.out.println("\nTemperature in Fahrenheit: " + fahrenheit + " °F");
    }
}
