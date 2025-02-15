package Heranca_Polimorfismo.Exercicio2.Aplicacao;

import Heranca_Polimorfismo.Exercicio2.Entidades.Contribuinte;
import Heranca_Polimorfismo.Exercicio2.Entidades.ContribuinteFisico;
import Heranca_Polimorfismo.Exercicio2.Entidades.ContribuinteJuridico;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Contribuinte> listContribuinte = new ArrayList<>();

        System.out.print("Digite a quantidade de Contribuintes: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Dados do Contribuinte " + i + ": ");
            System.out.print("Contribuinte Físico ou Jurídico (F/J) : ");
            char opcao = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Renda Anual: ");
            double renda = sc.nextDouble();

            if (opcao == 'F') {
                System.out.print("Despesas Médicas: ");
                double valorDespesas = sc.nextDouble();
                listContribuinte.add(new ContribuinteFisico(nome, renda, valorDespesas));
            } else {
                System.out.print("Numero de Funcionários: ");
                int numFuncionarios = sc.nextInt();
                listContribuinte.add(new ContribuinteJuridico(nome, renda, numFuncionarios));
            }
        }

        System.out.println();
        System.out.println("Total Impostos pagos: ");
        for (Contribuinte contribuinte : listContribuinte) {
            System.out.println(contribuinte.getNome() + " R$ " + String.format("%.2f", contribuinte.taxa()));
        }

        double soma = 0;
        for (Contribuinte contribuinte : listContribuinte) {
            soma += contribuinte.taxa();
        }
        System.out.println();
        System.out.printf("Total Impostos: " + String.format("%.2f",soma));

        sc.close();
    }
}
