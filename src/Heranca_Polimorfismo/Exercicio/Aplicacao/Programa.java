package Heranca_Polimorfismo.Exercicio.Aplicacao;

import Heranca_Polimorfismo.Exercicio.Entidades.Produto;
import Heranca_Polimorfismo.Exercicio.Entidades.ProdutoImportado;
import Heranca_Polimorfismo.Exercicio.Entidades.ProdutoUsado;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Programa {
    public static void main(String[] args) throws ParseException {

        List<Produto> listProduto = new ArrayList<>();

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Digite a quantidade de produtos: ");
        int quantiProd = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= quantiProd; i++) {
            System.out.println("Dados do " + i + "º Produto : ");
            System.out.println("O Produto é Comum(C), Usado(U) ou Importado(I): ");
            char opcao = sc.next().charAt(0);
            sc.nextLine();

            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Preço: ");
            double preco = sc.nextDouble();

            if (opcao == 'C') {
                listProduto.add(new Produto(nome, preco));
            }
            if (opcao == 'I') {
                System.out.print("Taxa Alfândegaria: ");
                double taxaAlfandega = sc.nextDouble();
                listProduto.add(new ProdutoImportado(nome, preco, taxaAlfandega));
            }
            if (opcao == 'U') {
                System.out.print("Data de Fabricação (DD/MM/YYYY)");
                Date dataFabricacao = sdf.parse(sc.next());
                listProduto.add(new ProdutoUsado(nome, preco, dataFabricacao));
            }
        }

        for (Produto prod : listProduto) {
            System.out.println(prod.tag());
        }

        sc.close();
    }
}
