import java.util.Scanner;

public class IntroducirDatos {
    public static void main(String[] args) {
        // Introducir valores a una matriz
        int renglones, columnas;
        Scanner scanner = new Scanner(System.in);
        // Definir la matriz
        System.out.println("¿Cuantos renglones tiene la matriz?: ");
        renglones = Integer.parseInt(scanner.nextLine());
        System.out.println("¿Cuantas columnas tiene la matriz?");
        columnas = Integer.parseInt(scanner.nextLine());
        int[][] matriz = new int[renglones][columnas];
        // Pedimos los valores para rellenar la matriz
        for (int ren = 0; ren < renglones; ren++){
            for (int col = 0; col < columnas; col++){
                System.out.println("Introduce un valor para la matriz [" + ren + "][" + col + "]");
                matriz[ren][col] = Integer.parseInt(scanner.nextLine());
            }
        }
        // Iteramos los valores de la matriz
        for (int ren = 0; ren < renglones; ren++){
            for (int col = 0; col < columnas; col++){
                System.out.println("El valor para [" + ren + "][" + col + "], es: " + matriz[ren][col]);
            }
        }
    }
}
