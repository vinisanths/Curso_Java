package ExercicioFor;
import java.util.Scanner;


//Ler um número inteiro N e calcular todos os seus divisores.


public class Exercicio6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite un numero para calcular seus divisores: ");
        int numero = sc.nextInt();

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                System.out.println(i);
            }
        } sc.close();
    }
}

