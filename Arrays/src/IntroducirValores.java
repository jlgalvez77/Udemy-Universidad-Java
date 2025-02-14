import java.util.Scanner;

public class IntroducirValores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Declaración del arreglo
        System.out.println("Ingrese el tamaño del arreglo: ");
        int tamano = scanner.nextInt();
        int[] numeros = new int[tamano];

        // Inicialización del arreglo
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese el valor para la posición " + i + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Imprimir los elementos del arreglo
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
}
