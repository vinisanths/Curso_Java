package Generics_Set_Map.ExCuringasDelimitados.Aplicacao;

import Generics_Set_Map.ExCuringasDelimitados.Entidades.Circulo;
import Generics_Set_Map.ExCuringasDelimitados.Entidades.Formas;
import Generics_Set_Map.ExCuringasDelimitados.Entidades.Retangulo;

import java.util.ArrayList;
import java.util.List;

public class Programa {
    public static void main(String[] args) {

        List<Formas> formasList = new ArrayList<>();
        formasList.add(new Retangulo(3.0,4.0));
        formasList.add(new Circulo(3.0));

        List<Circulo> circuloList = new ArrayList<>();
        circuloList.add(new Circulo(2.0));
        circuloList.add(new Circulo(3.0));

        System.out.println("Area Total: " + areaTotal(circuloList));

    }

    public static double areaTotal(List <? extends Formas> list){
        double soma = 0;
        for (Formas s : list){
            soma += s.area();
        }
        return soma;
    }
}
