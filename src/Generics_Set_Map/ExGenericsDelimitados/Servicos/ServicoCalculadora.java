package Generics_Set_Map.ExGenericsDelimitados.Servicos;

import java.util.List;

public class ServicoCalculadora {

    public static <T extends Comparable<T>> T max (List<T> list){
        if (list.isEmpty()){
            throw new IllegalStateException("A lista não pode ser Vazia");
        }
        T max = list.get(0);
        for (T item : list){
            if(item.compareTo(max) > 0){
                max = item;
            }
        }
        return max;
    }

}
