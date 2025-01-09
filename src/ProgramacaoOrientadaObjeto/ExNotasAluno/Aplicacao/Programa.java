package ProgramacaoOrientadaObjeto.ExNotasAluno.Aplicacao;

import ProgramacaoOrientadaObjeto.ExNotasAluno.Entidades.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Entre com os dados do aluno");
        System.out.print("Nome do aluno: ");
        aluno.nome = sc.nextLine();

        System.out.print("Digite as 3 notas: ");
        aluno.nota1 = sc.nextDouble();
        aluno.nota2 = sc.nextDouble();
        aluno.nota3 = sc.nextDouble();

        aluno.somaNota();

        aluno.calculaMedia();




        sc.close();
    }
}
