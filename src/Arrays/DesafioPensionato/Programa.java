package Arrays.DesafioPensionato;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        // Configura a localidade para Estados Unidos (para garantir uso do ponto como separador decimal)
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in); // Cria o scanner para capturar entradas do usuário

        // Array para representar os quartos. Cada índice representa um número de quarto.
        // O conteúdo de cada posição será o nome e email do locatário (caso ocupado).
        String[] quartos = new String[10];

        // Solicita ao usuário quantos quartos serão alugados.
        System.out.print("Quantos quartos serão alugados? ");
        int n = sc.nextInt(); // Lê o número de quartos que serão alugados
        sc.nextLine(); // Consome a quebra de linha após nextInt()

        // Variáveis auxiliares para armazenar informações de cada locatário
        int numeroQuarto; // Número do quarto escolhido pelo locatário
        String[] nomes = new String[n]; // Array para armazenar os nomes dos locatários
        String[] email = new String[n]; // Array para armazenar os emails dos locatários

        // Loop para receber os dados de cada locatário
        for (int i = 0; i < n; i++) {
            System.out.println("Aluguel " + (i + 1) + ":"); // Identifica o aluguel atual
            System.out.print("Nome: ");
            nomes[i] = sc.nextLine(); // Lê o nome do locatário
            System.out.print("email: ");
            email[i] = sc.nextLine(); // Lê o email do locatário
            System.out.print("Numero do quarto: ");
            numeroQuarto = sc.nextInt(); // Lê o número do quarto escolhido pelo locatário
            sc.nextLine(); // Consome a quebra de linha após nextInt()

            // Armazena as informações do locatário no array de quartos, na posição correspondente ao número do quarto
            quartos[numeroQuarto] = nomes[i] + ", " + email[i];
        }

        // Imprime a lista de quartos ocupados e seus respectivos locatários
        System.out.println("quartos Alugados: ");
        for (int i = 0; i < quartos.length; i++) { // Percorre todos os quartos
            if (quartos[i] != null) { // Se o quarto estiver ocupado, exibe suas informações
                System.out.println(i + ", " + quartos[i]);
            }
        }

        // Fecha o scanner para liberar os recursos utilizados
        sc.close();
    }
}
