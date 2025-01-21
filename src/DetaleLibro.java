public class DetaleLibro {
    public static void main(String[] args) {
        // Detalle de un libro
        String tituloLibro = "El Señor de los Anillos";
        int anioPublicacion = 1954;
        boolean libroDisponible = true;
        double precio = 59.95;
        // Imprimir el valor de las variables
        System.out.println("Titulo: " + tituloLibro);
        System.out.println("Año de publicación: " + anioPublicacion);
        System.out.println("¿Disponible? " + libroDisponible);
        System.out.println("Precio: " + precio);
        // Modificar el titulo del libro
        tituloLibro = "el señor de los anillos";
        System.out.println(tituloLibro);
    }
}
