package ProgramacaoFuncional.ExPredicado.Util;

import ProgramacaoFuncional.ExPredicado.Entidades.Produto;

import java.util.function.Predicate;

public class PredicadoProduto implements Predicate<Produto> {

    @Override
    public boolean test(Produto produto) {
        return produto.getPreco() >= 100;
    }
}
