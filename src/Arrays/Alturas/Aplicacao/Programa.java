package Arrays.Alturas.Aplicacao;

import Arrays.Alturas.Entidade.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de pessoas: ");
        int n = sc.nextInt();
        Pessoa[] vetor = new Pessoa[n];

        double soma = 0;
        double porcentagem = 0;
        double maiorQue16 = 0;

        for (int i = 0; i < vetor.length; i++) {
            sc.nextLine();
            System.out.printf("nome da " + (i + 1) + "ª pessoa: ");
            String nome = sc.nextLine();

            System.out.printf("idade da " + (i + 1) + "ª pessoa: ");
            int idade = sc.nextInt();

            System.out.printf("altura da " + (i + 1) + "ª pessoa: ");
            double altura = sc.nextDouble();

            vetor[i] = new Pessoa(nome, idade, altura);
            soma = soma + vetor[i].getAltura();
        }


        double media = soma / vetor.length;


        System.out.printf("Altura média das pessoas: %.2f%n", media);

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i].getIdade() < 16) {
                maiorQue16 ++;
                porcentagem = (maiorQue16 / vetor.length) * 100;
            }
        }

        System.out.println("Pessoas com menos de 16 anos: " + porcentagem + "%");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i].verificaIdade();
        }
        sc.close();
    }
}
