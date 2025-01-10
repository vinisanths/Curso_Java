package ProgramacaoOrientadaObjeto.ExCotacaoDolar.Aplicacao;

import ProgramacaoOrientadaObjeto.ExCotacaoDolar.Utilitaria.ConverteMoeda;

//Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por
//uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda
//que a pessoa terá que pagar 6% de IOF sobre o valor em dólar.

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o valor do dolar: ");
        double valorDolar = sc.nextDouble();
        System.out.print("Quantos dolares deseja Comprar: ");
        double quantiDolar = sc.nextDouble();

        double totalDolar = ConverteMoeda.cambio(valorDolar, quantiDolar);

        System.out.printf("quantia paga em reais: %.2f%n", totalDolar );

        sc.close();
    }
}
