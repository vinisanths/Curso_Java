package Heranca.Exemplo.Entidades;

public class ContaPoupanca extends Conta{
    private double taxaJuros;
    public ContaPoupanca(){
        super();
    }
    public ContaPoupanca(Integer numero, String nome, Double saldo, Double taxaJuros) {
        super(numero, nome, saldo);
        this.taxaJuros = taxaJuros;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }
    public void atualizaSaldo(){
        saldo += saldo*taxaJuros;
    }

    @Override
    public void saque (double valor){
        saldo -= valor;
    }
}
