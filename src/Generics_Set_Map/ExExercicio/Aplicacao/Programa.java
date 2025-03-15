package Generics_Set_Map.ExExercicio.Aplicacao;

import Generics_Set_Map.ExExercicio.Entidades.LogUsuario;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Programa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o caminho do arquivo: ");
        String caminho = sc.nextLine();

        try(BufferedReader br = new BufferedReader(new FileReader(caminho))){

            Set<LogUsuario> set = new HashSet<>();

            String linha = br.readLine();
            while (linha != null){

                String[] campos = linha.split(" ");
                String nomeUsuario = campos[0];
                Date momento = Date.from(Instant.parse(campos[1]));

                set.add(new LogUsuario(nomeUsuario, momento));
                linha = br.readLine();

            }

            System.out.println("Total de Usuários: " + set.size());

            for (LogUsuario log : set) {
                System.out.println("Usuário: " + log.getNomeUsuario());
            }

        } catch (IOException e) {
            throw new RuntimeException("Erro: " + e.getMessage());
        }

        sc.close();

    }
}
//Um site de internet registra um log de acessos dos usuários.
//Um registro de log consiste no nome de usuário (apenas uma palavra)
//e o instante em que o usuário acessou o site no padrão ISO 8601, separados por espaço.
//Fazer um programa que leia o log de acessos a partir de um arquivo,
// e daí informe quantos usuários distintos acessaram o site.
