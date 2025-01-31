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
            while (temId(list, id)){
                System.out.println("Este ID ja existe. Tente novamente: ");
                id = sc.nextInt();
            }

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
        Funcionario funcionario = list.stream().filter(x -> x.getId() == idFunc).findFirst().orElse(null);

        if (funcionario == null) {
            System.out.println("Este Id não existe");
            System.out.println();
        } else {
            System.out.print("Digite a porcentagem: ");
            double porcentagem = sc.nextDouble();
            funcionario.incrementaSalario(porcentagem);
        }
        for (Funcionario func : list) {
            System.out.println(func);
        }

        sc.close();
    }
    public static boolean temId(List <Funcionario> list, int id){
        Funcionario funcionario = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return funcionario != null;
    }
}
