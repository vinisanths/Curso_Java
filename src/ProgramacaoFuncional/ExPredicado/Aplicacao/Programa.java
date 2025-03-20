package ProgramacaoFuncional.ExPredicado.Aplicacao;

import ProgramacaoFuncional.ExPredicado.Entidades.Produto;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

public class Programa {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Produto> list = new ArrayList<>();

        list.add(new Produto("Tv", 900.00));
        list.add(new Produto("Mouse", 50.00));
        list.add(new Produto("Tablet", 350.00));
        list.add(new Produto("HD Case", 80.90));

        //Remove baseado na interface funcional
        //list.removeIf(new PredicadoProduto());

        //(Referência para metodo (::)) baseado em um metodo estático
        //list.removeIf(Produto::predicadoProdutoStatic);

        //(Referência para metodo (::)) baseado em um metodo não estático
        //list.removeIf(Produto::predicadoProdutoNaoStatic);

        double min = 100.0;

        //Expressao Lambda declarada
        //Predicate<Produto> pred = p -> p.getPreco() >= min;
        //list.removeIf(pred);

        //Expressao Lambda Inline
        list.removeIf(p -> p.getPreco() >= min);


        for (Produto p : list){
            System.out.println(p);
        }

    }
}
