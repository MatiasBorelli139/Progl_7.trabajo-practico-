import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        String[] estudiantes = {"Juan", "María", "Pedro", "Ana", "Matias"};
        double[] notas = {8.5, 9.0, 7.5, 10.0, 6.0};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el nombre del estudiante:");
        String nombreBuscado = scanner.nextLine();

        boolean encontrado = false;
        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i].equals(nombreBuscado)) {
                System.out.println("La nota de " + nombreBuscado + " es: " + notas[i]);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("El estudiante " + nombreBuscado + " no se encuentra en la lista.");
        }
    }
}