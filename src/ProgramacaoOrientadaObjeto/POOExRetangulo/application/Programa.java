package ProgramacaoOrientadaObjeto.POOExRetangulo.application;


import ProgramacaoOrientadaObjeto.POOExRetangulo.entidades.Retangulo;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Retangulo a = new Retangulo();

        System.out.println("Digite a ALtura e Largura do retangulo: ");
        a.altura = sc.nextDouble();
        a.largura = sc.nextDouble();

        a.area();
        a.perimetro();

        System.out.printf("Area = %.2f%n", a.area());
        System.out.printf("Perimetro = %.2f%n", a.perimetro());
        System.out.printf("Diagonal = %.2f%n", a.diagonal());

        sc.close();

    }
}
