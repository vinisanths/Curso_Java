package ExercicioWhile;
import java.util.Scanner;


//Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
//um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
//4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
//que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
//mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme exemplo.


public class Exercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int quantiClienteAlcool = 0;
        int quantiClienteDiesel = 0;
        int quantiClienteGasolina = 0;

        System.out.println("Informe o codigo: ");
        int codigo = sc.nextInt();

        while (codigo != 4){
            if (codigo == 1){
                quantiClienteAlcool += 1;
                System.out.println("Abasteceu Alcool "+ quantiClienteAlcool + " vezes");
                codigo = sc.nextInt();
            } else if (codigo == 2) {
                quantiClienteGasolina += 1;
                System.out.println("Abasteceu Gasolina "+ quantiClienteGasolina + " vezes");
                codigo = sc.nextInt();
            } else if (codigo == 3) {
                quantiClienteDiesel += 1;
                System.out.println("Abasteceu Diesel "+ quantiClienteDiesel + " vezes");
                codigo = sc.nextInt();
            }else{
                System.out.println("Codigo Invalido. Digite novamente! ");
                codigo = sc.nextInt();
            }
        }
            System.out.println("Muito Obrigado");
            System.out.println("Alcool: " + quantiClienteAlcool);
            System.out.println("Gasolina: " + quantiClienteGasolina);
            System.out.println("Diesel: " + quantiClienteDiesel);

        sc.close();



    }
}
