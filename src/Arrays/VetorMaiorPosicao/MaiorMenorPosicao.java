package Arrays.VetorMaiorPosicao;

import java.util.Scanner;

public class MaiorMenorPosicao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int maiorNumero = 0;
        int posicaoMaior = 0;

        System.out.print("Quantos numeros voce vai digitar? ");
        n = sc.nextInt();
        int vetor[] = new int[n];

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Digite um numero: ");
            vetor[i] = sc.nextInt();
        }
        System.out.println(" ");


        for (int i = 0; i < vetor.length; i++) {
            if (maiorNumero < vetor[i]) {
                maiorNumero = vetor[i];
                posicaoMaior = i;
            }
        }

        System.out.println("Maior valor: " + maiorNumero);
        System.out.println("Posição do maior: " + posicaoMaior);

        sc.close();
    }
}
