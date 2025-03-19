package Generics_Set_Map.ExMap2.Aplicacao;

import Generics_Set_Map.ExMap2.Entidades.Produto;

import java.util.HashMap;
import java.util.Map;

public class Programa {
    public static void main(String[] args) {

        Map<Produto, Double> estoque = new HashMap<>();

        Produto p1 = new Produto("Tv", 900.0);
        Produto p2 = new Produto("Notebook", 1200.0);
        Produto p3 = new Produto("Tablet", 400.0);

        estoque.put(p1, 10000.0);
        estoque.put(p2, 20000.0);
        estoque.put(p3, 15000.0);

        Produto ps = new Produto("Tv", 900.0);

        System.out.println("Contem chave 'ps': " + estoque.containsKey(ps));

    }
}
