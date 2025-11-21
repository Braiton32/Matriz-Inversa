public class TestingMatrizInversa {
    public static void main(String[] args) {
        String archivoEntrada = "matriz.txt";
        String archivoSalida = "matriz_inversa.txt";

        double[][] matriz = MatrizInversa.leerMatriz(archivoEntrada);

        if (matriz != null) {
            System.out.println("matriz original:");
            MatrizInversa.imprimirMatriz(matriz);

            double[][] inversa = MatrizInversa.calcularInversa(matriz);

            if (inversa != null) {
                System.out.println("\nmatriz inversa:");
                MatrizInversa.imprimirMatriz(inversa);

                MatrizInversa.escribirArchivo(inversa, archivoSalida);
                System.out.println("\narchivo generado exitosamente: " + archivoSalida);
            } else {
                System.out.println("\nno se puede calcular la inversa (matriz no cuadrada o determinante = 0). ");
            }
        } else {
            System.out.println("error al leer la matriz.");
        }
    }
}
