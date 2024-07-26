package ExercicioFor;
import java.util.Scanner;


//Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
//começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor.


public class Exercicio7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero positivo: ");
        int numero = sc.nextInt();

        for (int i = 1; i <= numero; i++) {
            System.out.print(i + " ");
            System.out.print(i*i + " ");
            System.out.println( i * i * i);
        }

    }
}
