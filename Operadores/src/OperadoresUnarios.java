public class OperadoresUnarios {
    public static void main(String[] args) {
        System.out.println("*** Operadores Unarios ***");
        int a = 3, b = -2, resultado;
        boolean c = true;
        // Operador Unario +
        resultado = +a;
        System.out.println("Resultado de +a: " + resultado);
        // Operador Unario -
        resultado = -a;
        System.out.println("Resultado de -a: " + resultado);
        // Operador Unarios incremento y decremento
        // Pre-incremento
        resultado = ++a;    // Primero incrementa y luego asigna
        System.out.println("Resultado de ++a: " + resultado);
        // Post-incremento
        resultado = a++;    // Primero asigna y luego incrementa
        System.out.println("Resultado de a++: " + resultado);
        // Pre-decremento
        resultado = --b;    // Primero decrementa y luego asigna
        System.out.println("Resultado de --b: " + resultado);
        // Post-decremento
        resultado = b--;    // Primero asigna y luego decrementa
    }
}
