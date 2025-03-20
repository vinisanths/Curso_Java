package ProgramacaoFuncional.ExComparator.Aplicacao;

import ProgramacaoFuncional.ExComparator.Entidades.Produto;

import java.util.Comparator;

public class MyComparator implements Comparator<Produto> {

    @Override
    public int compare(Produto p1, Produto p2) {
        return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
    }
}
