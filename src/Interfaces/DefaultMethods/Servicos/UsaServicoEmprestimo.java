package Interfaces.DefaultMethods.Servicos;

public class UsaServicoEmprestimo implements ServicoImprestimo {

    private double taxaImprestimo;

    public UsaServicoEmprestimo(double taxaImprestimo) {
        this.taxaImprestimo = taxaImprestimo;
    }

    @Override
    public double getTaxaImprestimo() {
        return taxaImprestimo;
    }

}
