package ExerciciosEstruturaCondicional;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não

        System.out.println("Digite o numero: ");
        int a = sc.nextInt();

        if (a >= 0){
            System.out.println("NAO NEGATIVO");
        } else {
            System.out.println("NEGATIVO");
        }
        sc.close();

    }
}
