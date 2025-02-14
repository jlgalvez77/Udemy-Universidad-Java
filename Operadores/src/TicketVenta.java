import java.util.Scanner;

public class TicketVenta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Precio leche: ");
        var precioLeche = Double.parseDouble(scanner.nextLine());
        System.out.println("Precio pan: ");
        var precioPan = Double.parseDouble(scanner.nextLine());
        System.out.println("Precio lechuga: ");
        var precioLechuga = Double.parseDouble(scanner.nextLine());
        System.out.println("Precio platanos: ");
        var precioPlatanos = Double.parseDouble(scanner.nextLine());

        System.out.println("¿Tiene algún descuento? (%)");
        var descuentoPorcentaje = Double.parseDouble(scanner.nextLine());

        // Cálculo subtotal sin impuestos
        var subtotal = precioLeche + precioPan + precioLechuga + precioPlatanos;

        // Aplicamos el descuento
        var descuento = subtotal * (descuentoPorcentaje / 100);

        // Subtotal con descuento
        var subtotalConDescuento = subtotal - descuento;

        // Cálculo con impuestos(16%)
        var impuesto = subtotalConDescuento * 0.16;

        // Cálculo del total de la compra
        var costeTotal = subtotalConDescuento + impuesto;

        System.out.printf("""
                Subtotal: $%.2f
                Descuento: $%.2f (%.2f%%)
                Impuestos (16%%): $%.2f
                Coste total de la compra: $%.2f
                """, subtotal, descuento, descuentoPorcentaje, impuesto, costeTotal);
    }
}
