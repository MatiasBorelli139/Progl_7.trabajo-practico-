import java.util.Scanner;

public class Ejercicio4  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] productos = new String[3];
        int[] unidades = new int[3];
        double[] precios = new double[3];
        double totalTicket = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Producto " + (i + 1) + ":");
            productos[i] = scanner.nextLine();
            System.out.println("Unidades:");
            unidades[i] = scanner.nextInt();
            System.out.println("Precio por unidad:");
            precios[i] = scanner.nextDouble();
            scanner.nextLine();
            totalTicket += unidades[i] * precios[i];
        }

        System.out.println("\nTICKET");
        System.out.println("---------------------------------");
        System.out.println("Producto   Unidades   Precio/U   Total");
        for (int i = 0; i < 3; i++) {
            System.out.println(productos[i] + "   " + unidades[i] + "   " + precios[i] + "   " + (unidades[i] * precios[i]));
        }
        System.out.println("---------------------------------");
        System.out.println("TOTAL: " + totalTicket);

        scanner.close();
    }
}