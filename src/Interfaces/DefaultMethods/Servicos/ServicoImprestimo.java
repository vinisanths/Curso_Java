package Interfaces.DefaultMethods.Servicos;

import java.security.InvalidParameterException;

public interface ServicoImprestimo {
    double getTaxaImprestimo();

    default double pagamento(double quantia, int meses) {
        if (meses < 0) {
            throw new InvalidParameterException("Meses devem ser maiores que 0");
        }
        return quantia * Math.pow(1.0 + getTaxaImprestimo() / 100.0, meses);
    }

}
