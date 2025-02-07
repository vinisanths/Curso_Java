package Enumeracoes.Exemplo1.Aplicacao;

import Enumeracoes.Exemplo1.Entidades.Departamento;
import Enumeracoes.Exemplo1.Entidades.HoraContrato;
import Enumeracoes.Exemplo1.Entidades.Trabalhador;
import Enumeracoes.Exemplo1.Enum.NivelTrabalhador;

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

        System.out.print("Digite o nome do departamento: ");
        String nomeDepartamento = sc.nextLine();

        System.out.println("Digite os dados do Funcionario");
        System.out.print("Nome: ");
        String nomeFuncionario = sc.nextLine();

        System.out.print("Nivel: ");
        String nivelTrabalhador = sc.nextLine();

        System.out.print("Salario Base: ");
        double salarioBase = sc.nextDouble();

        Trabalhador trabalhador = new Trabalhador(nomeFuncionario, NivelTrabalhador.valueOf(nivelTrabalhador), salarioBase, new Departamento(nomeDepartamento));

        System.out.print("Quantos contratos este trabalhador tem? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n ; i++) {
            System.out.println("Digite os dados do Contrato " + i + ": ");
            System.out.print("Data (DD/MM/YYYY): ");
            Date dataContrato = sdf.parse(sc.next());
            System.out.print("Valor por hora: ");
            double valorPorHora = sc.nextDouble();
            System.out.print("Duracao (Horas): ");
            int horas = sc.nextInt();
            HoraContrato contrato = new HoraContrato(dataContrato, valorPorHora, horas);
            trabalhador.adicionaContrato(contrato);
        }
        System.out.println();
        System.out.print("Digite o mes e ano para calcular o salario(MM/YYYY): ");
        String mesEAno = sc.next();
        int mes = Integer.parseInt(mesEAno.substring(0,2));
        int ano = Integer.parseInt(mesEAno.substring(3));

        System.out.println();
        System.out.println("Nome: " + trabalhador.getName());
        System.out.println("Departamento: " + trabalhador.getDepartamento().getNome());
        System.out.println("Renda " + mesEAno + ": "+ String.format("%.2f", trabalhador.renda(mes, ano)));


        sc.close();
    }
}


