package Heranca_Polimorfismo.ExemploClassesMetodosAbstratos.Aplicacao;

import Heranca_Polimorfismo.ExemploClassesMetodosAbstratos.Entidades.Circulo;
import Heranca_Polimorfismo.ExemploClassesMetodosAbstratos.Entidades.Forma;
import Heranca_Polimorfismo.ExemploClassesMetodosAbstratos.Entidades.Retangulo;
import Heranca_Polimorfismo.ExemploClassesMetodosAbstratos.EntidadesEnum.Cor;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Forma> formaList = new ArrayList<>();

        System.out.print("Digite a quantidade de Formas: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Dados da forma N" + i + "º: ");
            System.out.print("Retângulo ou Circulo (R/C): ");
            char opcao = sc.next().charAt(0);
            System.out.print("Cor (VERMELHO/AZUL/PRETO): ");
            Cor cor = Cor.valueOf(sc.next());

            if (opcao == 'R') {
                System.out.print("Largura: ");
                double largura = sc.nextDouble();
                System.out.print("Altura: ");
                double altura = sc.nextDouble();
                formaList.add(new Retangulo(cor, largura, altura));
            } else {
                System.out.print("Raio: ");
                double raio = sc.nextDouble();
                formaList.add(new Circulo(cor, raio));
            }

        }
        System.out.println();
        System.out.println("Areas das Formas: ");
        for (Forma forma : formaList){
            System.out.println(String.format("%.2f", forma.area()) + " COR: " + forma.getCor());
        }

        sc.close();
    }
}
