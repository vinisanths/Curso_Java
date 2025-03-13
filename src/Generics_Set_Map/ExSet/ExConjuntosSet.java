package Generics_Set_Map.ExSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExConjuntosSet {
    public static void main(String[] args) {

        Set<String> set = new LinkedHashSet<>();

        set.add("Tv");
        set.add("Notebook");
        set.add("Tablet");

        //System.out.println(set.contains("Notebook")); retorna um Boolean

        //set.remove("Tablet");//remove baseado no parâmetro passado
        set.removeIf(x -> x.charAt(0) == 'T');// remove baseado um predicado/regex(Expressão Regular)

        for (String s : set){
            System.out.println(s);
        }
    }
}
