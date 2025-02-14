public class OperadoresAsignacion {
    public static void main(String[] args) {
        System.out.println("*** Operadores de Asignación ***");
        int a = 3, resultado;
        // Operador de Asignación Simple
        resultado = a;
        System.out.println("Resultado de a: " + resultado);
        // Operador de Asignación de Adición
        resultado += a; // resultado = resultado + a;
        System.out.println("Resultado de resultado += a: " + resultado);
        // Operador de Asignación de Sustracción
        resultado -= a; // resultado = resultado - a;
        System.out.println("Resultado de resultado -= a: " + resultado);
        // Operador de Asignación de Multiplicación
        resultado *= a; // resultado = resultado * a;
        System.out.println("Resultado de resultado *= a: " + resultado);
        // Operador de Asignación de División
        resultado /= a; // resultado = resultado / a;
        System.out.println("Resultado de resultado /= a: " + resultado);
        // Operador de Asignación de Módulo
        resultado %= a; // resultado = resultado % a;
        System.out.println("Resultado de resultado %= a: " + resultado);
    }
}
