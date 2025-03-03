package Interfaces.ExSemInterface.Aplicacao;


import Interfaces.ExSemInterface.Modelo.Entidade.AluguelCarro;
import Interfaces.ExSemInterface.Modelo.Entidade.Veiculo;
import Interfaces.ExSemInterface.Modelo.Servicos.ServicoAluguel;
import Interfaces.ExSemInterface.Modelo.Servicos.TaxaServicoBrasil;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Digite os Dados do aluguel");
        System.out.print("Modelo do Carro: ");
        String modeloCarro = sc.nextLine();
        System.out.print("Retirada (dd/mm/yyyy hh:mm) : ");
        LocalDateTime inicio = LocalDateTime.parse(sc.nextLine(), fmt);
        System.out.print("Devolução (dd/mm/yyyy hh:mm) : ");
        LocalDateTime fim = LocalDateTime.parse(sc.nextLine(), fmt);

        AluguelCarro al = new AluguelCarro(inicio, fim, new Veiculo(modeloCarro));

        System.out.print("Digite o preço por hora: ");
        double precoPorHora = sc.nextDouble();
        System.out.print("Digite o preço por Dia: ");
        double precoPorDia = sc.nextDouble();

        ServicoAluguel servicoAluguel = new ServicoAluguel(precoPorHora, precoPorDia, new TaxaServicoBrasil());

        servicoAluguel.processaFatura(al);

        System.out.println("==========Fatura==========");
        System.out.println("Pagamento Básico: " + String.format("%.2f", al.getFatura().getPagamentoBasico()));
        System.out.println("Imposto: " + String.format("%.2f", al.getFatura().getTaxa()));
        System.out.println("Pagamento Total: " + String.format("%.2f", al.getFatura().getPagamentoTotal()));

        sc.close();

    }
}
