package Arrays.DesafioPensionato.Aplicacao;

import Arrays.DesafioPensionato.Entidades.Cliente;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cliente[] vetor = new Cliente[10];
        System.out.print("Quantos Quartos serão alugados? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Aluguel N" + (i + 1) + ": ");
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Numero do quarto: ");
            int numeroQuarto = sc.nextInt();

            vetor[numeroQuarto] = new Cliente(nome, email);
        }

        System.out.println("Quartos Alugados");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] != null) {
                System.out.println(i + ": " + vetor[i]);
            }
        }

        sc.close();
    }
}
