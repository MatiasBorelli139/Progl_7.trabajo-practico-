import java.util.Scanner;

public class Ejercicio9  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Elige el tipo de conversión:");
        System.out.println("1. Celsius a Fahrenheit");
        System.out.println("2. Fahrenheit a Celsius");
        int opcion = scanner.nextInt();

        System.out.println("Introduce la temperatura:");
        double temperatura = scanner.nextDouble();

        if (opcion == 1) {
            System.out.println("Resultado: " + celsiusAFahrenheit(temperatura) + " °F");
        } else if (opcion == 2) {
            System.out.println("Resultado: " + fahrenheitACelsius(temperatura) + " °C");
        } else {
            System.out.println("Opción inválida.");
        }

        scanner.close();
    }

    public static double celsiusAFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitACelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
