package Arrays.SomaVetor;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n;
        double media, soma;

        System.out.print("Quantos numeros voce vai digitar? ");
        n = sc.nextInt();
        double vetor[] = new double[n];

        soma = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextDouble();
            soma += vetor[i];
        }

        media  = soma / vetor.length;

            System.out.println("valores = ");

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("%.1f%n" , vetor[i]);
        }

        System.out.println("Soma = " + soma);

        System.out.println("Média = " + media);


        sc.close();
    }
}
