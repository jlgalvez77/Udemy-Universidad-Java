public class FuncionesRecursivas {
    // Imprimir los valores del 1 al 5 utilizando una función recursiva
    static void recursiva(int numero){
        // Caso Base
        if (numero == 1){
            System.out.println(numero);
        }else {
            // Caso Recursivo
            recursiva(numero - 1);
            System.out.println(numero);
        }
    }

    public static void main(String[] args) {
        recursiva(5);
    }
}
