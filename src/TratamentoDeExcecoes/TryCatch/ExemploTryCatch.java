package TratamentoDeExcecoes.TryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExemploTryCatch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite a frase: ");
            String[] vetor = sc.nextLine().split(" ");
            System.out.print("Digite o index que deseja saber: ");
            int posicao = sc.nextInt();
            System.out.println(vetor[posicao]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Posição Invalida!");
        } catch (InputMismatchException e) {
            System.out.println("Erro de Input");
        }
        System.out.println("Fim do Programa!");

        sc.close();
    }
}
