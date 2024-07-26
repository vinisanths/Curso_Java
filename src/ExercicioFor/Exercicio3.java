package ExercicioFor;
import java.util.Locale;
import java.util.Scanner;


//Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
//de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
//conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5.


public class Exercicio3 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de valores: ");
        int valores = sc.nextInt();
        double mp = 0;

        for (int i = 0; i < valores; i++) {
            System.out.println("digite a nota 1: ");
            double nota1 = sc.nextDouble();
            System.out.println("digite a nota 2: ");
            double nota2 = sc.nextDouble();
            System.out.println("digite a nota 3: ");
            double nota3 = sc.nextDouble();

            mp = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / (2 + 3 + 5);

            System.out.printf("%.1f%n", mp);
        }
        sc.close();
    }
}
