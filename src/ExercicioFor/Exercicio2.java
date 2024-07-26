package ExercicioFor;

import java.util.Scanner;


//Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
//Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
//essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo)


public class Exercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int somaIn = 0;
        int somaOut = 0;
        int x = 0;

        System.out.println("Digite o numero: ");
        int numero = sc.nextInt();

        for (int i = 0; i < numero; i++) {
            System.out.println("Digite os numeros para serem verificados: ");
            x = sc.nextInt();
            if (x < 10 || x > 20) {
                somaOut += 1;
            } else {
                somaIn += 1;
            }

        }
        sc.close();
        System.out.println("In " + somaIn);
        System.out.println("Out " + somaOut);
    }
}
