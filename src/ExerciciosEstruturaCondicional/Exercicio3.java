package ExerciciosEstruturaCondicional;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
        //Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
        //ordem crescente ou decrescente.

        int num1, num2;

        System.out.println("Digite o primeiro numero: ");
        num1 = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        num2 = sc.nextInt();

        if ( num1 % num2 == 0 || num2 % num1 == 0){
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao multiplos");
        }

        sc.close();
    }
}
