package ExerciciosEstruturaCondicional;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar

        System.out.println("Digite o numero: ");
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("PAR");
        }else{
            System.out.println("IMPAR");
        }
        sc.close();

    }
}
