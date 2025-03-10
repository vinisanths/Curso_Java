package Interfaces.DefaultMethods.Servicos;

public class BrazilServicoImprestimo implements ServicoImprestimo {
    private double taxaImprestimo;

    public BrazilServicoImprestimo(double taxaImprestimo) {
        this.taxaImprestimo = taxaImprestimo;
    }

    @Override
    public double getTaxaImprestimo() {
        return taxaImprestimo;
    }
}
