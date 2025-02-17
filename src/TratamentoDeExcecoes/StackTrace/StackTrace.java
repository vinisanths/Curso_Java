package TratamentoDeExcecoes.StackTrace;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StackTrace {
    public static void main(String[] args) {

        metodo1();

        System.out.println("Fim do Programa");

    }
    public static void metodo1 (){
        System.out.println("============= Inicio Método 1 =============");
        metodo2();
        System.out.println("============= Fim Método 1 =============");
    }
    public static void metodo2(){
        System.out.println("============= Inicio Método 2 =============");

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite a frase: ");
            String[] vetor = sc.nextLine().split(" ");
            System.out.print("Digite o index que deseja saber: ");
            int posicao = sc.nextInt();
            System.out.println(vetor[posicao]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Posição Invalida!");
            e.printStackTrace();
            sc.next();
        } catch (InputMismatchException e) {
            System.out.println("Erro de Input");
        }
        System.out.println("Fim do Programa!");

        sc.close();
        System.out.println("============= Fim Método 2 =============");
    }
}
