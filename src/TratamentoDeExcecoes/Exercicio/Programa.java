package TratamentoDeExcecoes.Exercicio;

import TratamentoDeExcecoes.Exercicio.Modelo.Entidades.Conta;
import TratamentoDeExcecoes.Exercicio.Modelo.Excecao.ExcecaoDeDominio;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("Digite os dados da Conta: ");
            System.out.print("Numero: ");
            int numero = sc.nextInt();
            sc.nextLine();
            System.out.print("Titular da Conta: ");
            String nome = sc.nextLine();
            System.out.print("Saldo Inicial: ");
            double saldo = sc.nextDouble();
            System.out.print("Limite de Saque: ");
            double limiteDeSaque = sc.nextDouble();

            Conta conta = new Conta(numero, nome, saldo, limiteDeSaque);
            System.out.println();

            System.out.print("Valor a ser Sacado: ");
            double valorSacado = sc.nextDouble();

            conta.withdraw(valorSacado);

            System.out.println();

            System.out.printf("Novo Saldo: " + String.format("%.2f", conta.getBalance()));

        }
        catch (ExcecaoDeDominio e) {
            System.out.println("Erro de Saque:" + e.getMessage());
        }
        catch (InputMismatchException e) {
            System.out.println("Dados de Entrada Inválidos!");
        }
        catch (RuntimeException e) {
            System.out.println("Erro Inesperado! ");
        }

        sc.close();
    }
}
