
package ProgramacaoOrientadaObjeto.ExSalarioFuncionario.Aplicacao;

import ProgramacaoOrientadaObjeto.ExSalarioFuncionario.Entidades.Funcionario;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();


        System.out.println("Digite as Informações do Funcionario");
        System.out.print("Nome: ");
        funcionario.nome = sc.nextLine();
        System.out.print("Salario Bruto: ");
        funcionario.salarioBruto = sc.nextDouble();
        System.out.print("Taxa do amor: ");
        funcionario.taxa = sc.nextDouble();

        System.out.println(funcionario);

        System.out.print("Digite a Porcentagem de Incremento de Salario: ");
        double incremento = sc.nextDouble();

        funcionario.incrementaSalario(incremento);
        System.out.printf("Dados Atualizados: " + funcionario.nome + ", R$ " + funcionario.salarioBruto );

        sc.close();

    }
}
