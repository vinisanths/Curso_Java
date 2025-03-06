package Interfaces.Exercicio.Aplicacao;


import Interfaces.Exercicio.Entidades.Contrato;
import Interfaces.Exercicio.Entidades.Parcela;
import Interfaces.Exercicio.Excecoes.Excecao;
import Interfaces.Exercicio.Servicos.ContratoServico;
import Interfaces.Exercicio.Servicos.ServicoPaypal;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {

            System.out.println("Digite os dados do contrato ");
            System.out.print("Numero: ");
            int numero = sc.nextInt();
            System.out.print("Data (DD/MM/AAAA): ");
            LocalDate data = LocalDate.parse(sc.next(), fmt);
            System.out.print("Valor Total: ");
            double valorTotal = sc.nextDouble();

            Contrato contrato = new Contrato(numero, data, valorTotal);

            System.out.print("Digite o numero de parcelas: ");
            int quantiParcelas = sc.nextInt();

            ContratoServico contratoServico = new ContratoServico(new ServicoPaypal());

            contratoServico.processaContrato(contrato, quantiParcelas);

            System.out.println("Parcelas: ");
            for (Parcela parcela : contrato.getParcelas()) {
                System.out.println(parcela);
            }

            sc.close();
        } catch (Excecao e) {
            System.out.println(e.getMessage());
        }
    }
}
