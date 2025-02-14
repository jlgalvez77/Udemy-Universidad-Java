public class Arreglos {
    public static void main(String[] args) {
        // Declaración e inicialización de un arreglo de enteros
        int[] numeros = new int[5];

        // Asignación de valores a los elementos del arreglo
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

        // Imprimir los elementos del arreglo
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        // Sintaxis simplificada para declarar e inicializar un arreglo
        int[] numeros2 = {1, 2, 3, 4, 5};

        // Imprimir los elementos del arreglo
        for (int i = 0; i < numeros2.length; i++) {
            System.out.println(numeros2[i]);
        }
    }
}
