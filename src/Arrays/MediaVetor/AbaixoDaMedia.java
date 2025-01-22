package Arrays.MediaVetor;

import java.util.Locale;
import java.util.Scanner;

public class AbaixoDaMedia {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        double soma = 0, media = 0;

        System.out.print("Quantos elementos vai ter o vetor? ");
        n = sc.nextInt();
        double vetor[] = new double[n];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextDouble();
            soma += vetor[i];
        }

        media = soma / vetor.length;

        System.out.printf("Média do vetor: %.3f%n" , media);
        System.out.println("Elementos abaixo da média: ");

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < media){
                System.out.println(vetor[i]);
            }
        }

        sc.close();
    }
}
