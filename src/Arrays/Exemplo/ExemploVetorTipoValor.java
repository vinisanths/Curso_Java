package Arrays.Exemplo;

import java.util.Locale;
import java.util.Scanner;

public class ExemploVetorTipoValor {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de alturas que deseja ler: ");
        int n = sc.nextInt();
        double []  vetor =  new double[n];
        for (int i = 0; i < vetor.length; i++) {

            System.out.printf("Digite a altura " + i +" : ");
            vetor [i] = sc.nextDouble();
        }

        double sum = 0.0;
        for (int i = 0; i < vetor.length; i++) {
            sum+= vetor[i];
        }

        double avg = sum / vetor.length;
        System.out.printf("Média das alturas: %.2f%n", avg);

        sc.close();
    }
}
