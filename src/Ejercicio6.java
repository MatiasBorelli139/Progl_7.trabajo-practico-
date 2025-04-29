import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] palabras = new String[5];
        String[] invertido = new String[5];

        for (int i = 0; i < palabras.length; i++) {
            System.out.println("Introduce una palabra:");
            palabras[i] = scanner.nextLine();
        }

        for (int i = 0; i < palabras.length; i++) {
            invertido[i] = palabras[palabras.length - 1 - i];
        }

        System.out.println("Array invertido:");
        for (String palabra : invertido) {
            System.out.println(palabra);
        }

        scanner.close();
    }
}
