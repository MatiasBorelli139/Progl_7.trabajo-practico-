public class Ejercicio8 {
    public static void main(String[] args) {
        int[] notas = {75, 90, 85, 70, 95};

        double promedio = calcularPromedio(notas);
        int notaAlta = obtenerNotaMasAlta(notas);

        System.out.println("Promedio: " + promedio);
        System.out.println("Nota más alta: " + notaAlta);
    }

    public static double calcularPromedio(int[] notas) {
        int suma = 0;
        for (int nota : notas) {
            suma += nota;
        }
        return (double) suma / notas.length;
    }

    public static int obtenerNotaMasAlta(int[] notas) {
        int max = notas[0];
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > max) {
                max = notas[i];
            }
        }
        return max;
    }
}
