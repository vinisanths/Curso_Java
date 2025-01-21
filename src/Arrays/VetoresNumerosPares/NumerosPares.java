package Arrays.VetoresNumerosPares;

import java.util.Scanner;
import java.util.Vector;

public class NumerosPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contadora = 0;
        int n = 0;

        System.out.print("Quantos numeros vai digitar: ");
        n = sc.nextInt();

        int numeros[] = new int[n];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o numero: ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("NUMEROS PARES: ");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                contadora++;
                System.out.println(numeros[i]);
            }
        }

        System.out.println("Quantidade de Pares = " + contadora);
        sc.close();
    }
}
