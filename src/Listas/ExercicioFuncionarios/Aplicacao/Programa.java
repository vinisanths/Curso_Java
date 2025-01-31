package Listas.ExercicioFuncionarios.Aplicacao;

import Listas.ExercicioFuncionarios.Entidades.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<Funcionario> list = new ArrayList<>();

        System.out.print("Quantos funcionários serão registrados: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println("Funcionario " + (i + 1) + ": ");
            System.out.print("ID: ");
            Integer id = sc.nextInt();
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Salario: ");
            Double salario = sc.nextDouble();
            Funcionario funcionario = new Funcionario(id, nome, salario);

            list.add(funcionario);
        }

        System.out.print("Digite o id do Funcionario que recebera aumento: ");
        int idFunc = sc.nextInt();
        Integer posicao = verificaID(list, idFunc);
        if (posicao == null) {
            System.out.println("Este Id não existe");
        } else {
            System.out.print("Digite a porcentagem: ");
            double porcentagem = sc.nextDouble();
            list.get(posicao).incrementaSalario(porcentagem);
        }
        for (Funcionario funcionario : list) {
            System.out.println(funcionario);
        }

        sc.close();
    }

    public static Integer verificaID(List<Funcionario> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }
}
