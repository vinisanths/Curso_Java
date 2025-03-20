package ProgramacaoFuncional.ExComparator.Aplicacao;

import ProgramacaoFuncional.ExComparator.Entidades.Produto;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Programa {
    public static void main(String[] args) {

        List<Produto> list = new ArrayList<>();

        list.add(new Produto("TV", 900.00));
        list.add(new Produto("Notebook", 1200.00));
        list.add(new Produto("Tablet", 450.00));

        //Definindo função anônima (arrow function)
        //Comparator<Produto> comp = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());

        //definindo expressão lambda como argumento da função
        list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

        for (Produto p : list) {
            System.out.println(p);
        }

    }
}
