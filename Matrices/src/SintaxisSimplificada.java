public class SintaxisSimplificada {
    public static void main(String[] args) {
        // Definición de matriz, metodo simplificado
        var matriz = new int [][]{{100, 200, 300},{400, 500, 600}};
        // Recorrer la matriz
        for (int ren = 0; ren < matriz.length; ren++){
            for (int col = 0; col < matriz[ren].length; col++){
                System.out.println("Valor [" + ren + "][" + col + "] = " + matriz[ren][col]);
            }
        }
    }
}
