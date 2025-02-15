import java.util.Scanner;

public class EsPar {

    static void esPar(int numero){
        if (numero % 2 == 0){
            System.out.println("El número es par.");
        }else {
            System.out.println("El número es impar.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int numero = Integer.parseInt(scanner.nextLine());
        esPar(numero);
    }
}
