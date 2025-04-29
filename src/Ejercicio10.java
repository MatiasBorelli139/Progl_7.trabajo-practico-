import java.util.Arrays;

public class Ejercicio10  {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};

        System.out.println("Array original: " + Arrays.toString(numeros));

        rotarDerecha(numeros);

        System.out.println("Array rotado: " + Arrays.toString(numeros));
    }

    public static void rotarDerecha(int[] array) {
        int ultimo = array[array.length - 1];

        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }

        array[0] = ultimo;
    }
}
