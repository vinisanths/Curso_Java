package ExerciciosFixacao;

import java.util.Locale;
import java.util.Scanner;
//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
//decimais.
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite o numero de sua Matricula: ");
        int matricula = sc.nextInt();
        System.out.println("Digite a Quantidade de horas trabalhadas: ");
        double horas = sc.nextDouble();
        System.out.println("Defina o valor das Horas: ");
        double valorHora = sc.nextDouble();

        double salario = horas * valorHora;

        System.out.println("Sua Matricula é: " + matricula);
        System.out.printf("Seu Salario é: %.2f%n", salario);

        sc.close();


    }
}
