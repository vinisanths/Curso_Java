package Generics_Set_Map.ExGenerics.Aplicacao;

import Generics_Set_Map.ExGenerics.Servicos.ServiceImpress;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ServiceImpress<Integer> si = new ServiceImpress<>();

        System.out.print("Quantos Valores você ira digitar? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            Integer valor = sc.nextInt();
            si.addValor(valor);
        }

        si.print();
        Integer x = si.primeiro();
        System.out.println("Primeiro: " + x);

        sc.close();

    }
}
