package Interfaces.Comparable.Aplicacao;

import Interfaces.Comparable.Entidades.Funcionario;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Programa {
    public static void main(String[] args) {

        List<Funcionario> list = new ArrayList<>();
        String caminho = "D:\\funcionario.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
            String funcionarioTxt = br.readLine();
            while (funcionarioTxt != null) {
                String[] campo = funcionarioTxt.split(",");
                list.add(new Funcionario(campo[0], Double.parseDouble(campo[1])));
                funcionarioTxt = br.readLine();
            }
            Collections.sort(list);
            for (Funcionario f : list) {
                System.out.println(f.getNome() + " - " + f.getSalario());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
