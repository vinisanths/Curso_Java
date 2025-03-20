package Generics_Set_Map.ExercicioHashMap.Aplicacao;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o caminho do arquivo: ");
        String caminho = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {

            Map<String, Integer> votos = new HashMap<>();

            String linha = br.readLine();
            while (linha != null){

                String[] campos = linha.split(",");
                String nomeUsuario = campos[0];
                int quantVotos = Integer.parseInt(campos[1]);

                if (votos.containsKey(nomeUsuario)){
                    int votosPassados = votos.get(nomeUsuario);
                    votos.put(nomeUsuario, votosPassados + quantVotos);
                }else {
                    votos.put(nomeUsuario, quantVotos);
                }

                linha = br.readLine();

            }
            for (String key : votos.keySet()){
                System.out.println(key + ": " + votos.get(key));
            }


        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
