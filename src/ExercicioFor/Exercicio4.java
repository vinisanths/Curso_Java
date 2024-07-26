package ExercicioFor;
import java.util.Scanner;


//Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
//segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".



public class Exercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de pares para realizar a divisão: ");
        int pares = sc.nextInt();

        for (int i = 0; i < pares; i++) {

            System.out.println("Digite o primeiro numero: ");
            double num1 = sc.nextInt();
            System.out.println("Digite o segundo numero: ");
            double num2 = sc.nextInt();

            if (num2 == 0) {
                System.out.println("Divisão impossivel");
            }else {
                System.out.println(num1 / num2);
            }


        } sc.close();

    }
}
