package ExerciciosEstruturaCondicional;
import java.util.Scanner;
//Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
//seguir, calcule e mostre o valor da conta a pagar.
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double cc = 4.00;
        double xsalada = 4.50;
        double xbacon = 5.00;
        double torrada = 2.00;
        double refrigerante = 1.50;


        System.out.println("Informe o codigo do produto: ");
        int codigo = sc.nextInt();
        System.out.println("Informe a quantidade de produtos: ");
        int quantidade = sc.nextInt();


        if (codigo == 1){
            System.out.println("Total: R$ " + quantidade * cc);
        } else if (codigo == 2) {
            System.out.println("Total: R$ "+ quantidade * xsalada);
        } else if (codigo == 3) {
            System.out.println("Total: R$ " + quantidade * xbacon);
        }else if (codigo == 4){
            System.out.println("Total: " + quantidade * torrada);
        }else {
            System.out.println("Total: " + quantidade * refrigerante);
        }

        sc.close();

    }
}
