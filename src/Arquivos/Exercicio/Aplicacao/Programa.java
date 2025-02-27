package Arquivos.Exercicio.Aplicacao;

import Arquivos.Exercicio.Entidade.Produto;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Produto> list = new ArrayList<>();

        System.out.print("Digite o Caminho do arquivo: ");
        String sourceFileStr = sc.nextLine();

        File sourceFile = new File(sourceFileStr);
        String sourceFolderStr = sourceFile.getParent();

        boolean sucesso = new File(sourceFolderStr + "/out").mkdir();

        String targetFileStr = sourceFolderStr + "/out/summary.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {

            String itemCsv = br.readLine();
            while (itemCsv != null) {

                String[] fields = itemCsv.split(",");
                String nome = fields[0];
                double preco = Double.parseDouble(fields[1]);
                int quantidade = Integer.parseInt(fields[2]);

                list.add(new Produto(nome, preco, quantidade));

                itemCsv = br.readLine();

            }
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {
                for (Produto produto : list) {
                    bw.write(produto.getNome() +", "+ String.format("%.2f", produto.total()));
                    bw.newLine();
                }

                System.out.println(targetFileStr + " Criado");
            } catch (IOException e) {
                System.out.println("Erro: " + e.getMessage());
            }

        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        sc.close();

    }
}
