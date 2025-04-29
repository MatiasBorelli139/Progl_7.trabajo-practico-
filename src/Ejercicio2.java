import java.util.Scanner;

public class Ejercicio2  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un texto:");
        String texto = scanner.nextLine();

        System.out.println("Introduce una letra:");
        char letraBuscada = scanner.next().charAt(0);

        int contador = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == letraBuscada) {
                contador++;
            }
        }

        System.out.println("La letra '" + letraBuscada + "' aparece " + contador + " veces en el texto.");

        scanner.close();
    }
}