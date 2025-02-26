package Arquivos;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_BufferedWriter {
    public static void main(String[] args) {

        String[] lines = new String[]{
                "Good Morning!",
                "Good Afternoon",
                "Good Night"
        };

        String path = "D:\\teste.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
            for (String line : lines){
                bw.write(line);
                bw.newLine();
            }
            System.out.println("Linhas Adicionadas Com Sucesso!");
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
