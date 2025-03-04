package Interfaces.ExComInterface.Modelo.Servicos;

import Interfaces.ExComInterface.Modelo.Entidade.AluguelCarro;
import Interfaces.ExComInterface.Modelo.Entidade.Fatura;

import java.time.Duration;

public class ServicoAluguel {

    private Double precoPorHora;
    private Double precoPorDia;

    private TaxaServico taxaServico;

    public ServicoAluguel(Double precoPorHora, Double precoPorDia, TaxaServico taxaServico) {
        this.precoPorHora = precoPorHora;
        this.precoPorDia = precoPorDia;
        this.taxaServico = taxaServico;
    }

    public void processaFatura(AluguelCarro aluguelCarro){

        double minutos = Duration.between(aluguelCarro.getInicio(), aluguelCarro.getFim()).toMinutes();
        double horas = minutos/60;

        double pagamentoBasico;
        if (horas <= 12.0){
            pagamentoBasico = precoPorHora * Math.ceil(horas);
        }else {
            pagamentoBasico = precoPorDia * Math.ceil(horas / 24);
        }

        double taxa = taxaServico.Taxa(pagamentoBasico);

        aluguelCarro.setFatura(new Fatura(pagamentoBasico , taxa));
    }
}
