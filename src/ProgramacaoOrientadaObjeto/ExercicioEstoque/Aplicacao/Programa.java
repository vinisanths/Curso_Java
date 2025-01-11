package ProgramacaoOrientadaObjeto.ExercicioEstoque.Aplicacao;

import ProgramacaoOrientadaObjeto.ExercicioEstoque.Entidade.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os dados do produto: ");
        System.out.print("Nome do produto: ");
        String nome = sc.nextLine();

        System.out.print("Preço do produto: ");
        double preco = sc.nextDouble();
        Produto produto = new Produto(nome, preco);

        System.out.println();
        System.out.println("Dados do produto: " + produto);

        System.out.print("Quantidade de Produtos a seren adicionados no estoque: ");
        int quantidade = sc.nextInt();
        produto.adicionaProduto(quantidade);

        System.out.println();
        System.out.println("Dados do produto: " + produto);

        System.out.print("Quantidade de Produtos a serem removidos do estoque: ");
        quantidade = sc.nextInt();
        produto.removerProduto(quantidade);

        System.out.println();
        System.out.println("Dados do produto: " + produto);

        sc.close();
    }
}
