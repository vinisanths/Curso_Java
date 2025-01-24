package Arrays.Boletim.Aplicacao;

import Arrays.Boletim.Entidade.Alunos;

//Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram no 1º e 2º semestres.
//Cada uma dessas informações deve ser armazenada em um vetor.
//Depois, imprimir os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou igual a 6.0 (seis).

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quantos alunos serão digitados? ");
        int n = sc.nextInt();

        Alunos[] vetor = new Alunos[n];

        for (int i = 0; i < vetor.length; i++) {
            sc.nextLine();
            System.out.println("Digite o nome, Primeira e Segunda nota do " + (i + 1) + "º Aluno:");

            String nome = sc.nextLine();
            double nota1 = sc.nextDouble();
            double nota2 = sc.nextDouble();

            vetor[i] = new Alunos(nome, nota1, nota2);
        }
        System.out.println("Alunos aprovados: ");

        for (int i = 0; i < vetor.length; i++) {
            double media = vetor[i].getNota1() + vetor[i].getNota2();

            if ((media / 2) >= 6) {
                System.out.println(vetor[i].getNome());
            }
        }

        sc.close();
    }
}