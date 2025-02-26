package Arquivos;

import java.io.File;
import java.util.Scanner;

public class Pastas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o caminho da pasta: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        File[] pastas = path.listFiles(File :: isDirectory);
        System.out.println("Pastas: ");
        for (File pasta : pastas){
            System.out.println(pasta);
        }

        System.out.println();

        File[] arquivos = path.listFiles(File::isFile);
        System.out.println("Arquivos: ");
        for (File arquivo : arquivos){
            System.out.println(arquivo);
        }

        System.out.println();

        boolean sucesso = new File(strPath + "\\Nova Pasta").mkdir();
        System.out.println("Pasta Criada com Sucesso: " + sucesso);


        sc.close();

    }
}
