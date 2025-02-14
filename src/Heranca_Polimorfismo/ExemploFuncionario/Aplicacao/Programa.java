package Heranca_Polimorfismo.ExemploFuncionario.Aplicacao;

import Heranca_Polimorfismo.ExemploFuncionario.Entidades.Funcionario;
import Heranca_Polimorfismo.ExemploFuncionario.Entidades.FuncionarioTerceirizado;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Funcionario> listFunc = new ArrayList<>();

        System.out.print("Quantidade de Funcionários: ");
        int numFunc = sc.nextInt();


        for (int i = 1; i <= numFunc ; i++) {
            System.out.println("Dados do funcionario " + i + ":");
            System.out.print("Terceirizado? (S/N): ");
            char opcao = sc.next().charAt(0);
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Quantidade de Horas: ");
            int horas = sc.nextInt();
            System.out.print("Valor por Hora: ");
            double valorPorHora = sc.nextDouble();

            if (opcao == 'S') {
                System.out.print("Custo Adicional: ");
                double custoAdicional = sc.nextDouble();
                listFunc.add(new FuncionarioTerceirizado(nome,horas, valorPorHora,custoAdicional ));
            }else {
                listFunc.add(new Funcionario(nome, horas, valorPorHora));
            }
        }

        System.out.println();
        System.out.println("Pagamnetos: ");
        for (Funcionario func : listFunc) {
            System.out.println(func.getNome() + " - R$" + String.format("%.2f", func.pagamento()));
        }


        sc.close();
    }
}
