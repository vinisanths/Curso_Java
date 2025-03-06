package Interfaces.Exercicio.Servicos;

import Interfaces.Exercicio.Entidades.Contrato;
import Interfaces.Exercicio.Entidades.Parcela;

import java.time.LocalDate;

public class ContratoServico {

    private ServicoPagamentoOnline servicoPagamentoOnline;

    public ContratoServico(ServicoPagamentoOnline servicoPagamentoOnline) {
        this.servicoPagamentoOnline = servicoPagamentoOnline;
    }

    public void processaContrato(Contrato contrato, int meses) {

        double parcelaBasica = contrato.getValorTotal() / meses;
        for (int i = 1; i <= meses; i++) {
            LocalDate dataVencimento = contrato.getData().plusMonths(i);

            double juros = servicoPagamentoOnline.juros(parcelaBasica, i);
            double taxa = servicoPagamentoOnline.taxaPagamento(parcelaBasica + juros);

            double parcela = parcelaBasica + juros + taxa;

            contrato.getParcelas().add(new Parcela(dataVencimento, parcela));

        }
    }
}
