package POO.program;



import POO.entities.Acount;

import java.util.Locale;
import java.util.Scanner;

public class Aplication {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Acount conta1;

        double valor;
        double saldoInicial;

        System.out.print("Digite o numero da conta: ");
        int conta = sc.nextInt();

        System.out.print("Digite o nome da conta: ");
        sc.nextLine();
        String nome = sc.nextLine();

        System.out.print("Quer Adicionar um valor inicial a conta (S/N)? ");
        char opcao = sc.next().charAt(0);

        if (opcao == 's') {
            System.out.println("digite o deposito inicial: ");
            saldoInicial = sc.nextDouble();
            conta1 = new Acount(conta, nome, saldoInicial);
        } else {
            conta1 = new Acount(conta, nome);
        }

        System.out.println("Dados da conta: ");
        System.out.println(conta1);

        System.out.print("Digite o valor a ser depositado: ");
        valor = sc.nextDouble();
        conta1.deposito(valor);
        System.out.println(conta1);

        System.out.println("Digite o valor a ser sacado: ");
        valor = sc.nextDouble();
        conta1.saque(valor);
        System.out.println(conta1);

        sc.close();

    }
}
