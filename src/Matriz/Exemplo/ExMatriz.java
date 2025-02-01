package Matriz.Exemplo;

import java.util.Scanner;

public class ExMatriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual sera o tamanho da Matriz: ");
        int n = sc.nextInt();

        int[][] matriz = new int[n][n];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println();

        System.out.println("Diagonal Principal: ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + " ");
        }
        System.out.println();

        int contadora = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 0) {
                    contadora++;
                }
            }
        }

        System.out.println("Quantidades de Negativos:  " + contadora);
        sc.close();
    }
}
