package ProgramacaoFuncional.Consumer.Aplicacao;

import ProgramacaoFuncional.Consumer.Entidades.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public class Programa {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Produto> list = new ArrayList<>();

        list.add(new Produto("Tv", 900.00));
        list.add(new Produto("Mouse", 50.00));
        list.add(new Produto("Tablet", 350.00));
        list.add(new Produto("HD Case", 80.90));

        //atualiza preco via classe Consumer
        //list.forEach(new AtualizaPreco());

        //atualiza via metodo estatico
        //list.forEach(Produto::atualizaPrecoStatic);

        //atualiza via metodo não estatico
        //list.forEach(Produto::atualizaPrecoNaoStatic);

        double valor = 1.1;
        //Expressao lambda declarada
        //Consumer<Produto> cons = produto -> produto.setPreco(produto.getPreco() * valor);
        //list.forEach(cons);

        //Expressao lambda inline
        list.forEach(produto -> produto.setPreco(produto.getPreco() * valor));

        //Referencia de metodo de println
        list.forEach(System.out::println);

    }
}
