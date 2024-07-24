package ExerciciosEstruturaCondicional;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int dia = 24;

        System.out.println("Digite o horario de inicio do jogo: ");
        int horaInicio = sc.nextInt();
        System.out.println("Digite o horario de fim do jogo: ");
        int horaFinal = sc.nextInt();

        if (horaInicio == horaFinal ){
            System.out.println("O JOGO DUROU " + dia + " HORAS(S)");
        }else if (horaInicio > 12){
            System.out.println(" O JOGO DUROU " + ((dia - horaInicio) + (horaFinal )) + " HORA(S)");
        } else if (horaInicio <= 12){
            System.out.println("O JOGO DUROU " + ((horaFinal - dia) - (horaInicio - dia)) + " HORA(S)");
        }
        sc.close();

    }
}
