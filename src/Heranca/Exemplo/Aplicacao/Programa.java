package Heranca.Exemplo.Aplicacao;

import Heranca.Exemplo.Entidades.Conta;
import Heranca.Exemplo.Entidades.ContaEmpresa;
import Heranca.Exemplo.Entidades.ContaPoupanca;

public class Programa {
    public static void main(String[] args) {

        Conta conta = new Conta(1001, "Bob", 0.0);
        ContaEmpresa contaEmpresa = new ContaEmpresa(1002, "Maria", 0.0, 500.0);

        //UPCASTING

        Conta conta1 = new Conta();
        Conta conta2 = new ContaEmpresa(1003, "Bob", 0.0, 200.0);
        Conta conta3 = new ContaPoupanca(1004, "Anna", 0.0, 0.01);

        //DOWN CASTING

        ContaEmpresa conta4 = (ContaEmpresa) conta2;
        conta4.deposito(100.0);

        //ContaEmpresa conta5 = (ContaEmpresa) conta3; Não Pode realizar a operação de Downcasting por conta de conta3 ser uma subclasse diferente
        if (conta3 instanceof ContaEmpresa) {
            ContaEmpresa conta5 = (ContaEmpresa) conta3;
            conta5.emprestimo(200.0);
            System.out.println("Emprestimo Realizado");
        }
        if (conta3 instanceof ContaPoupanca){
            ContaPoupanca conta5 = (ContaPoupanca) conta3;
            conta5.atualizaSaldo();
            System.out.println("Saldo Atualizado");
        }
        System.out.println("========== testes Override ===============");


        Conta teste1 = new Conta(100, "Jose", 1000.0);
        teste1.saque(200.00);
        System.out.println("Sem Override: " + teste1.getSaldo());

        Conta teste2 = new ContaPoupanca(101, "Maria", 1000.0, 0.01);
        teste2.saque(200.00);
        System.out.println("Com Override: " + teste2.getSaldo());

        Conta teste3 = new ContaEmpresa(103,"Joao", 1000.0, 100.0);
        teste3.saque(200);
        System.out.println("Com Override e a palavra Super: " + teste3.getSaldo());




    }
}
