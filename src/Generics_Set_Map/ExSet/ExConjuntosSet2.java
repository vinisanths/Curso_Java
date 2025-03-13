package Generics_Set_Map.ExSet;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class ExConjuntosSet2 {
    public static void main(String[] args) {

        Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));

        System.out.println("Conjunto A: " + a);
        System.out.println("Conjunto B: " + b);

        //União
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.print("Conjunto C apos junção do conjunto A + B : ");
        System.out.println(c);

        //Intersecção
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.print("Conjunto D apos intersecção (Elementos em comum) de A e B: ");
        System.out.println(d);

        //Diferença
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b);
        System.out.print("Conjunto E com os elementos presentes em A que não existem em B: ");
        System.out.println(e);
    }
}
