import java.util.Scanner;

public class Rango_Variable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número entero: ");
        int numero = Integer.parseInt(scanner.nextLine());

        // Revisamos si está dentro del rango de 1 a 10
        boolean rango = numero >= 1 && numero <= 10;
        if (rango == true) {
            System.out.println("El valor proporcionado está dentro del rango");
        } else {
            System.out.println("El valor proporcionado está fuera de rango");
        }
    }
}
