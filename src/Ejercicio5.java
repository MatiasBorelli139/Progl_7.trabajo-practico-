import java.util.Random;

public class Ejercicio5  {
    public static void main(String[] args) {
        int[] vectorNumeros = new int[10];
        Random random = new Random();

        for (int i = 0; i < vectorNumeros.length; i++) {
            vectorNumeros[i] = random.nextInt(10) + 1;
        }

        for (int i = 0; i < vectorNumeros.length; i++) {
            System.out.println("Número: " + vectorNumeros[i] + ", Cuadrado: " + (vectorNumeros[i] * vectorNumeros[i]) + ", Cubo: " + (vectorNumeros[i] * vectorNumeros[i] * vectorNumeros[i]));
        }
    }
}
