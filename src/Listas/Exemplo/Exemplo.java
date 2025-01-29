package Listas.Exemplo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Classe de exemplo que demonstra o uso da classe List em Java.
 * O código inclui operações básicas, como adição, remoção, busca, filtragem, ordenação e outras operações úteis.
 */
public class Exemplo {
    public static void main(String[] args) {

        // Criando uma lista de Strings
        List<String> list = new ArrayList<>();

        // Adicionando elementos à lista
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add("Vinicius");
        list.add(2, "Marcos"); // Adiciona "Marcos" na posição 2 (índice baseado em zero)

        // Exibindo o tamanho da lista
        System.out.println("Tamanho da Lista: ");
        System.out.println(list.size());
        System.out.println("----------------------------------");

        // Percorrendo e imprimindo os elementos da lista usando um for-each
        System.out.println("For each para percorrer a lista: ");
        for (String i : list){
            System.out.println(i);
        }
        System.out.println("----------------------------------");

        // Removendo elementos cujos nomes começam com 'M' usando expressão lambda
        System.out.println("Removendo elementos pela inicial da String ");
        list.removeIf(x -> x.charAt(0) == 'M');
        for(String x : list){
            System.out.println(x);
        }
        System.out.println("----------------------------------");

        // Obtendo o índice de um elemento específico na lista
        System.out.println("Mostrando o índice pela inicial da String: ");
        System.out.println("Índice de Bob: " + list.indexOf("Bob")); // Retorna a posição de Bob
        System.out.println("Índice de Marco: " + list.indexOf("Marco")); // Elemento não encontrado retorna -1
        System.out.println("----------------------------------");

        // Filtrando elementos que começam com a letra 'A' e armazenando em uma nova lista
        System.out.println("Salvando resultados de uma busca em uma nova lista: ");
        List<String> resultado = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for (String x : resultado){
            System.out.println(x);
        }
        System.out.println("----------------------------------");

        // Obtendo o primeiro elemento encontrado que começa com a letra 'V' (se existir)
        System.out.println("Mostrando o primeiro resultado de uma busca em uma lista: ");
        String nome = list.stream().filter(x -> x.charAt(0) == 'V').findFirst().orElse(null);
        System.out.println(nome); // Retorna "Vinicius" ou null se não encontrado
        System.out.println("----------------------------------");

        // Ordenando a lista em ordem alfabética
        System.out.println("Ordenando a lista em ordem alfabética: ");
        Collections.sort(list);
        for (String x : list){
            System.out.println(x);
        }
        System.out.println("----------------------------------");

        // Convertendo lista para um array
        System.out.println("Convertendo lista para array: ");
        String[] array = list.toArray(new String[0]);
        for (String x : array){
            System.out.println(x);
        }
        System.out.println("----------------------------------");

        // Verificando se um elemento está na lista
        System.out.println("Verificando se a lista contém 'Alex': ");
        System.out.println(list.contains("Alex")); // Retorna true se existir na lista
        System.out.println("----------------------------------");

        // Substituindo um elemento na lista
        System.out.println("Substituindo 'Bob' por 'Roberto': ");
        int index = list.indexOf("Bob");
        if (index != -1) {
            list.set(index, "Roberto");
        }
        for (String x : list){
            System.out.println(x);
        }
        System.out.println("----------------------------------");

        // Revertendo a ordem dos elementos da lista
        System.out.println("Revertendo a ordem dos elementos da lista: ");
        Collections.reverse(list);
        for (String x : list){
            System.out.println(x);
        }
        System.out.println("----------------------------------");

        // Limpando todos os elementos da lista
        System.out.println("Limpando todos os elementos da lista...");
        list.clear();
        System.out.println("Lista após limpeza: " + list);
        System.out.println("----------------------------------");
    }
}
