public class OperadoresComparacion {
    public static void main(String[] args) {
        System.out.println("*** Operadores de Comparación ***");
        int a = 3, b = 2, resultado;
        boolean c = true;
        // Operador de Igualdad ==
        boolean resultadoBoolean = a == b;
        System.out.println("Resultado de a == b: " + resultadoBoolean);
        // Operador de Desigualdad !=
        resultadoBoolean = a != b;
        System.out.println("Resultado de a != b: " + resultadoBoolean);
        // Operador de Mayor que >
        resultadoBoolean = a > b;
        System.out.println("Resultado de a > b: " + resultadoBoolean);
        // Operador de Menor que <
        resultadoBoolean = a < b;
        System.out.println("Resultado de a < b: " + resultadoBoolean);
        // Operador de Mayor o Igual que >=
        resultadoBoolean = a >= b;
        System.out.println("Resultado de a >= b: " + resultadoBoolean);
        // Operador de Menor o Igual que <=
        resultadoBoolean = a <= b;
        System.out.println("Resultado de a <= b: " + resultadoBoolean);

    }
}
