package Arrays.DadosPessoas.Programa;

import Arrays.DadosPessoas.Entidades.Pessoas;

import java.util.Locale;
import java.util.Scanner;

//Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas.
//Fazer um programa que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número de homens.

public class Aplicacao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n, numHomem = 0, quantiMulher = 0;
        double somaAltMulher = 0, maiorAlt = 0;
        System.out.print("Quantas pessoas voçe vai digitar? ");
        n = sc.nextInt();

        Pessoas[] vetor = new Pessoas[n];

        for (int i = 0; i < vetor.length; i++) {
            sc.nextLine();

            System.out.print("Altura da " + (i + 1) + "º pessoa: ");
            double altura = sc.nextDouble();
            System.out.print("Sexo da " + (i + 1) + "º pessoa: ");
            char sexo = sc.next().charAt(0);

            vetor[i] = new Pessoas(sexo, altura);
        }

        double menorAlt = vetor[0].getAltura();

        for (int i = 0; i < vetor.length; i++) {
            if (maiorAlt < vetor[i].getAltura()) {
                maiorAlt = vetor[i].getAltura();
            }
        }

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i].getAltura() < menorAlt) {
                menorAlt = vetor[i].getAltura();
            }
        }
        double mediaMulher = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i].getSexo() == 'F') {
                somaAltMulher += vetor[i].getAltura();
                quantiMulher++;

            } else {
                numHomem++;
            }
            mediaMulher = somaAltMulher / quantiMulher;
        }

        System.out.println("Menor Altura: " + menorAlt);
        System.out.println("Maior altura: " + maiorAlt);
        System.out.printf("Média das alturas das mulheres: %.2f%n", mediaMulher);
        System.out.println("Numero de homens: " + numHomem);

        sc.close();

    }
}
