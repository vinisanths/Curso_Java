package Generics_Set_Map.Covariancia_Contravariancia.ExGetPut;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Programa {
    public static void main(String[] args) {

        List<Integer> inteiros = Arrays.asList(1, 2, 3, 4);
        List<Double> doubles = Arrays.asList(3.4, 6.28);
        List<Object> objetos = new ArrayList<>();

        System.out.println("Lista de Inteiros: ");
        imprimiLista(inteiros);
        System.out.println("Lista de Doubles: ");
        imprimiLista(doubles);
        System.out.println("Lista obj: ");
        imprimiLista(objetos);
        System.out.println("Lista obj apos receber lista de Inteiros: ");
        copia(inteiros, objetos);
        imprimiLista(objetos);
        System.out.println("Lista obj apos receber lista de Doubles: ");
        copia(doubles, objetos);
        imprimiLista(objetos);

    }

    public static void copia(List<? extends Number> origem, List<? super Number> destino) {
        for (Number numero : origem) {
            destino.add(numero);
        }
    }

    public static void imprimiLista(List<?> list) {
        for (Object obj : list) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }
}
