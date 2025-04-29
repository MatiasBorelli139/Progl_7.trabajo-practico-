import java.util.Scanner;

public class Ejercicio7  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
                "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        int[] dias = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.println("Introduce un número de mes (1-12):");
        int numeroMes = scanner.nextInt();

        if (numeroMes >= 1 && numeroMes <= 12) {
            System.out.println("Mes: " + meses[numeroMes - 1] + ", Días: " + dias[numeroMes - 1]);
        } else {
            System.out.println("Número de mes inválido.");
        }

        scanner.close();
    }
}
