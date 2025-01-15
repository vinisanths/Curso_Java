package ProgramacaoOrientadaObjeto.POOExConta.program;

import ProgramacaoOrientadaObjeto.POOExConta.entities.Conta;

import java.util.Locale;
import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Conta conta1;

        System.out.print("Digite o numero da conta: ");
        int conta = sc.nextInt();

        System.out.print("Digite o nome do Usuario: ");
        sc.nextLine();
        String nome = sc.nextLine();

        System.out.println("Deseja realzar um deposito inicial?: (S/N)");
        char opcao = sc.next().charAt(0);
        if (opcao == 'S'){
            System.out.println("Digite o valor do Deposito Inicial: ");
            double saldoInicial = sc.nextDouble();
            conta1 = new Conta(conta, nome, saldoInicial);
        }else{
            conta1 = new Conta(conta, nome);
        }
        System.out.println("Dados da conta: ");
        System.out.println(conta1);

        System.out.print("Digite o valor a ser depositado: ");
        double valor = sc.nextDouble();
        conta1.depositar(valor);

        System.out.println("Dados Atualizados: ");
        System.out.println(conta1);

        System.out.print("Digite o valor a ser Sacado: ");
        valor = sc.nextDouble();
        conta1.sacar(valor);

        System.out.println("Dados Atualizados: ");
        System.out.println(conta1);

        sc.close();
    }
}
