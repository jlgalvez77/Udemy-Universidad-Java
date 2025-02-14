import java.util.Scanner;

public class PromedioCalificaciones {
    public static void main(String[] args) {
        System.out.println("*** Promedio de calificaciones ***");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de calificaciones: ");
        int cantidadCalificaciones = scanner.nextInt();
        double[] calificaciones = new double[cantidadCalificaciones];
        double sumaCalificaciones = 0;

        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Ingrese la calificación " + (i + 1) + ": ");
            calificaciones[i] = scanner.nextDouble();
            sumaCalificaciones += calificaciones[i];
        }

        double promedio = sumaCalificaciones / cantidadCalificaciones;
        System.out.println("El promedio de las calificaciones es: " + promedio);
    }
}
