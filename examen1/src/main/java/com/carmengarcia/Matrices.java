package com.carmengarcia;
public class Matrices {
    public static int[][] matrizMaxima(int[][] m, int[][] n){
        int[][] bestMatriz = new int[m.length][m[0].length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                bestMatriz[i][j] = Math.max(m[i][j], n[i][j]);
            }
        }
        return bestMatriz;
    }
    public static void leerMatriz(int[][] m){
        for (int i = 0; i < m.length; i++) {
            System.out.printf("[");
            for (int j = 0; j < m[i].length; j++) {
                System.out.printf(" %d ", m[i][j]);
            }
            System.out.printf("]%n");
        }
    }
    public static void main(String[] args) {
        int[][] matriz1 = {{1, 2, 3},{6, 5, 7}};
        int[][] matriz2 = {{2, 1, 1},{9, 8, 2}};
        int [][] superMatriz = matrizMaxima(matriz1, matriz2);
        leerMatriz(superMatriz);
    }
}
