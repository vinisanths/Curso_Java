package Generics_Set_Map.ExGenerics.Servicos;

import java.util.ArrayList;
import java.util.List;

public class ServiceImpress<T> {

    private List<T> list = new ArrayList<>();

    public void addValor(T valor){
        list.add(valor);
    }

    public T primeiro(){
        if (list.isEmpty()){
            throw new IllegalArgumentException("Lista Vazia!");
        }
        return list.get(0);
    }

    public void print(){
        System.out.print("[");
        if (!list.isEmpty()){
            System.out.print(list.get(0));
        }
        for (int i = 1; i < list.size(); i++) {
            System.out.print(", " + list.get(i));
        }
        System.out.println("]");

    }
}
