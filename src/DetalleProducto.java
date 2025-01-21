public class DetalleProducto {
    public static void main(String[] args) {
        String nombreProducto = "Tablet";
        float precioProducto = 595.99F;
        int cantidadDisponible = 20;
        boolean disponibleVenta = true;
        System.out.println("Nombre del producto: " + nombreProducto);
        System.out.println("Precio del producto: " + precioProducto);
        System.out.println("Cantidad disponible: " + cantidadDisponible);
        System.out.println("Disponible para venta: " + disponibleVenta);
        nombreProducto = "Movil";
        precioProducto = 995.95F;
        cantidadDisponible = 50;
        disponibleVenta = false;
        System.out.println("Nombre del producto: " + nombreProducto);
        System.out.println("Precio del producto: " + precioProducto);
        System.out.println("Cantidad disponible: " + cantidadDisponible);
        System.out.println("Disponible para venta: " + disponibleVenta);
    }
}
