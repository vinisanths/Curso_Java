package Arrays;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de alturas que deseja ler: ");
        int n = sc.nextInt();
        double [] vect = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Digite a altura " + i +" : ");
            vect[i] = sc.nextDouble();
        }

        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum+= vect[i];
        }

        double avg = sum / n;
        System.out.printf("Média das alturas: %.2f%n", avg);

        sc.close();
    }
}
