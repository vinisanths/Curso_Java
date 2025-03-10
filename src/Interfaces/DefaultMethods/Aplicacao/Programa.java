package Interfaces.DefaultMethods.Aplicacao;

import Interfaces.DefaultMethods.Servicos.BrazilServicoImprestimo;
import Interfaces.DefaultMethods.Servicos.ServicoImprestimo;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantia: ");
        double quantia = sc.nextDouble();
        System.out.print("Meses: ");
        int meses = sc.nextInt();

        ServicoImprestimo servicoImprestimo = new BrazilServicoImprestimo(2.0);
        double pagamento = servicoImprestimo.pagamento(quantia, meses);

        System.out.println("Pagamento apos " + meses + " meses: ");
        System.out.print(String.format("%.2f", pagamento));

        sc.close();

    }
}
