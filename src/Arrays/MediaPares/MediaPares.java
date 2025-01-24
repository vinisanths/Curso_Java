package Arrays.MediaPares;

//Fazer um programa para ler um vetor de N números inteiros.
//Em seguida, mostrar na tela a média aritmética somente dos números pares lidos, com uma casa decimal.
// Se nenhum número par for digitado, mostrar a mensagem "NENHUM NUMERO PAR"

import java.util.Scanner;

public class MediaPares {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, somaPar = 0, quantiPar = 0;

        System.out.print("Quantos Elementos vai ter o vetor: ");
        n = sc.nextInt();

        int numeros[] = new int[n];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextInt();

            if (numeros[i] % 2 == 0) {
                somaPar += numeros[i];
                quantiPar++;
            }
        }

        if (quantiPar > 0) {
            double media = somaPar / quantiPar;
            System.out.println("Média dos Pares: " + media);
        } else {
            System.out.println("Nenhum Numero Par");
        }

        sc.close();
    }

}
