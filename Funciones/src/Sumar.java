import java.util.Scanner;

public class Sumar {

    static int suma(int num1, int num2){
        return num1 + num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        int num1 = Integer.parseInt(scanner.nextLine());
        System.out.print("Introduce el segundo número: ");
        int num2 = Integer.parseInt(scanner.nextLine());
        System.out.print("La suma es: " + suma(num1,num2));
    }
}
