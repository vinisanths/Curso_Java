package Arrays.SomaDeVetores;

import java.util.Scanner;

//Faça um programa para somar dois vetores A e B, contendo N elementos cada.
//Em seguida, gere um terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B.
//Imprima o vetor C gerado.

public class SomaDeVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor1 = {8, 2, 11, 14, 13, 20};
        int[] vetor2 = {5, 10, 3, 1, 10, 7};
        int vetor3[] = new int[vetor2.length];

        for (int i = 0; i < vetor1.length; i++) {
            for (int j = 0; j < vetor2.length; j++) {
                for (int k = 0; k < vetor3.length; k++) {
                    vetor3[i] = vetor1[i] + vetor2[i];
                }
            }
        }

        System.out.println("VETOR RESULTANTE: ");
        for (int i = 0; i < vetor3.length; i++) {
            System.out.println(vetor3[i]);
        }

        sc.close();
    }
}
