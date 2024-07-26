package ExercicioFor;
import java.util.Scanner;


//Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
//Lembrando que, por definição, fatorial de 0 é 1.


public class Exercicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero para calcular o Fatorial: ");
        int n = sc.nextInt();
        int fatorial = 1;

        if (n != 0) {
            for (int i = 1; i <= n; i++) {
                fatorial *= i;
            }
            System.out.println(fatorial);
        } else {
            System.out.println("1 ");
        }sc.close();
    }
}
