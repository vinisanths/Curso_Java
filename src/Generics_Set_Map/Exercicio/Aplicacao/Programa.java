package Generics_Set_Map.Exercicio.Aplicacao;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();

        System.out.print("Quantos estudantes para o curso A? ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }

        System.out.print("Quantos estudantes para o curso B? ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            b.add(sc.nextInt());
        }

        System.out.print("Quantos estudantes para o curso C? ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            c.add(sc.nextInt());
        }

        Set<Integer> totalAlunos = new HashSet<>(a);
        totalAlunos.addAll(b);
        totalAlunos.addAll(c);


        System.out.println("Total de Estudantes: " + totalAlunos.size());
        sc.close();

    }
}
