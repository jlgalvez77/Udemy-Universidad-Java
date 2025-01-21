public class TiposDatos {
    public static void main(String[] args) {
        // Tipos de Datos en Java
        // Enteros
        byte tipoByte = 127;
        System.out.println("tipoByte = " + tipoByte);
        short tipoShort = 32000;
        System.out.println("tipoShort = " + tipoShort);
        int tipoInt = 43567345;
        System.out.println("tipoInt = " + tipoInt);
        long tipoLong = 43555555665368L;
        System.out.println("tipoLong = " + tipoLong);

        // Punto Flotante
        float tipoFloat = 3.14F;
        System.out.println("tipoFloat = " + tipoFloat);
        double tipoDouble = 45.73;
        System.out.println("tipoDouble = " + tipoDouble);

        // Caracter
        char tipoChar = 'a';
        System.out.println("tipoChar = " + tipoChar);

        // Boleano
        boolean tipoBoleano = true;
        System.out.println("tipoBoleano = " + tipoBoleano);

        // Tipos Object (Referencia)
        String nombre = null; // Valor por default
        System.out.println("nombre = " + nombre);
        nombre = "Juan Perez";
        System.out.println("nombre = " + nombre);
    }
}
