package Heranca_Polimorfismo.Exercicio.Entidades;

public final class ProdutoImportado extends Produto {
    private double taxaAlfandega;

    public ProdutoImportado() {
        super();
    }

    public ProdutoImportado(String nome, Double preco, double taxaAlfandega) {
        super(nome, preco);
        this.taxaAlfandega = taxaAlfandega;
    }

    public double getTaxaAlfandega() {
        return taxaAlfandega;
    }

    public void setTaxaAlfandega(double taxaAlfandega) {
        this.taxaAlfandega = taxaAlfandega;
    }

    public double precoTotal() {
        return getPreco() + this.taxaAlfandega;
    }

    @Override
    public final String tag() {
        return getNome() + " R$ " + String.format("%.2f", precoTotal()) + " (Taxa Alfandegaria: R$ " + String.format("%.2f", taxaAlfandega) + " )";
    }
}
