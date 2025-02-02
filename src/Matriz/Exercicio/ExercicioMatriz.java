package Matriz.Exercicio;

// Fazer um programa para ler dois números inteiros M e N.
// Depois ler uma matriz de N linhas por M colunas contendo números inteiros, podendo haver repetições.
// Em seguida, ler um número inteiro X que pertence à matriz.
// Para cada ocorrência de X, mostrar os valores à esquerda, acima, à direita e abaixo de X, quando houver.

import java.util.Scanner;

public class ExercicioMatriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero para a quantidade de linhas : ");
        int linhas = sc.nextInt();
        System.out.print("Digite um numero para a quantidade de colunas: ");
        int colunas = sc.nextInt();

        Integer matriz[][] = new Integer[linhas][colunas];
        System.out.println();

        for (int i = 0; i < linhas; i++) {
            System.out.print("Digite os elementos da linha " + (i + 1) + ": ");
            sc.nextLine();
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println();

        System.out.print("Digite o numero que deseja descobrir as coordenadas: ");
        int num = sc.nextInt();

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {

                if (matriz[i][j] == num) {

                    System.out.println("Posição " + i + ", " + j + ": ");
                    if (j > 0) {
                        System.out.println("Esquerda: " + matriz[i][j - 1]);
                    }
                    if (i > 0) {
                        System.out.println("Acima: " + matriz[i - 1][j]);
                    }
                    if (j < colunas - 1) {
                        System.out.println("Direita: " + matriz[i][j + 1]);
                    }
                    if (i < linhas - 1) {
                        System.out.println("Abaixo: " + matriz[i + 1][j]);
                    }
                }
            }
        }
        sc.close();
    }
}
