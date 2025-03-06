package Interfaces.Exercicio.Servicos;

public interface ServicoPagamentoOnline {
    double taxaPagamento(Double quantia);

    double juros(Double quantia, int meses);
}
