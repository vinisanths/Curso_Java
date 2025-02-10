package Enumeracoes.ExercicioLoja.Aplicacao;

import Enumeracoes.ExercicioLoja.Entidades.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


        System.out.println("Digite os Dados do cliente: ");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Data de Aniversario: ");
        Date aniversario = sdf.parse(sc.next());

        Cliente c1 = new Cliente(nome, email, aniversario);

        sc.nextLine();
        System.out.println("Digite o dados do Pedido: ");
        System.out.println("Status: ");
        StatusPedido status = StatusPedido.valueOf(sc.next());

        Pedido pedido = new Pedido(new Date(), status, c1);

        System.out.print("Quantos items há neste pedido: ");
        int numPedidos = sc.nextInt();
        for (int i = 1; i <= numPedidos; i++) {
            sc.nextLine();
            System.out.println("Digite os dados do #" + i + " pedido: ");
            System.out.print("Nome do Produto: ");
            String nomeProduto = sc.nextLine();
            System.out.print("Preço do Produto: ");
            double precoProduto = sc.nextDouble();

            Produto produto = new Produto(nomeProduto, precoProduto);
            System.out.print("Quantidade: ");
            int quantiProduto = sc.nextInt();

            ItemPedido itempedidos = new ItemPedido(quantiProduto, precoProduto, produto);

           pedido.adicionaProduto(itempedidos);
        }


        System.out.println(pedido);


        sc.close();
    }
}
