package Arrays.NumerosNegativos;

import java.util.Locale;
import java.util.Scanner;

public class NumerosNegativos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        int numeros[] = new int[n];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o numero: ");
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < 0){
                System.out.println("Numeros Negativos digitados: " + numeros[i]);
            }
        }

        sc.close();
    }
}
