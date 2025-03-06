package Interfaces.Exercicio.Servicos;

public class ServicoPaypal implements ServicoPagamentoOnline {

    public double taxaPagamento(Double quantia) {
        return quantia * 0.02;
    }

    public double juros(Double quantia, int meses) {

        return quantia * 0.01 * meses;
    }

}
