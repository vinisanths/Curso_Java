package Arrays.ExemploOrientadoObjeto.Aplicacao;

import Arrays.ExemploOrientadoObjeto.Entidade.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite a quantidade de Produtos que deseja ler: ");
        int n = sc.nextInt();
        Produto[] vetor = new Produto[n];

        for (int i = 0; i < vetor.length; i++) {
            sc.nextLine();
            System.out.print("Digite o nome do produto: ");
            String nome = sc.nextLine();
            System.out.print("Digite o preço do produto " + i + " : ");
            double preco = sc.nextDouble();
            vetor[i] = new Produto(nome, preco);
        }
        double soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i].getPreco();
        }

        double media = soma / vetor.length;

        System.out.printf("A média de preços dos produtos é: %.2f%n", media);

        sc.close();
    }
}
