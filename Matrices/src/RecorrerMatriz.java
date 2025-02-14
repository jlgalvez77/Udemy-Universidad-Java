public class RecorrerMatriz {
    public static void main(String[] args) {
        // Definición
        final int RENGLONES = 2;
        final int COLUMNAS = 3;
        int[][] matriz = new int[RENGLONES][COLUMNAS];
        // Rellenar la matriz
        matriz[0][0] = 100;
        matriz[0][1] = 200;
        matriz[0][2] = 300;
        matriz[1][0] = 400;
        matriz[1][1] = 500;
        matriz[1][2] = 600;
        // Recorrer matriz
        // 1. Ciclo mas externo, para recorrer los renglones
        for (int ren = 0; ren < RENGLONES; ren++){
            // 2. Ciclo interno, para recorrer las columnas
            for (int col = 0; col < COLUMNAS; col++){
                System.out.println("Valor[" + ren + "][" + col + "] = " + matriz[ren][col]);
            }
        }
    }
}
