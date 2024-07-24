package ExerciciosFixacao;

import java.util.Scanner;
//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
//código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
public class Exercicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o código da peça 1: ");
        int codigoPeca1 = sc.nextInt();
        System.out.println("Informa a Quantidade da Peça 1: ");
        int quantidadeDaPeca1 = sc.nextInt();
        System.out.println("Informa o valor da peça 1: ");
        double valorPeca1 = sc.nextDouble();


        System.out.println("Digite o código da peça 2: ");
        int codigoPeca2 = sc.nextInt();
        System.out.println("Informa a Quantidade da Peça 2: ");
        int quantidadeDaPeca2 = sc.nextInt();
        System.out.println("Informa o valor da peça 2: ");
        double valorPeca2 = sc.nextDouble();

        double total = ((quantidadeDaPeca1 * valorPeca1) + (quantidadeDaPeca2 * valorPeca2));

        System.out.printf(" VALOR A PAGAR: %.2f%n", total);

        sc.close();


    }
}
