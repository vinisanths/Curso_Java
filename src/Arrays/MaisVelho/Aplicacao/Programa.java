package Arrays.MaisVelho.Aplicacao;

import Arrays.MaisVelho.Entidade.Pessoa;
import java.util.Scanner;

//Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades.
//Os nomes devem ser armazenados em um vetor, e as idades em outro vetor.
//Depois, mostrar na tela o nome da pessoa mais velha.

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Quantas Pessoas voce vai digitar: ");
        n = sc.nextInt();
        String nomeMaior = "";

        Pessoa[] vetor = new Pessoa[n];

        for (int i = 0; i < vetor.length; i++) {
            sc.nextLine();
            System.out.println("Dados da " + (i + 1) + " Pessoa");
            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Idade: ");
            int idade = sc.nextInt();

            vetor[i] = new Pessoa(nome, idade);
        }

        int maiorIdade = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (maiorIdade < vetor[i].getIdade()) {
                maiorIdade = vetor[i].getIdade();
                nomeMaior = vetor[i].getNome();
            }
        }

        System.out.println("");
        System.out.println("Pessoa mais Velha: " + nomeMaior);

        sc.close();
    }
}
