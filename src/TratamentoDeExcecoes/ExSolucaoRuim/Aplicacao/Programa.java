package TratamentoDeExcecoes.ExSolucaoRuim.Aplicacao;

import TratamentoDeExcecoes.ExSolucaoRuim.Modelo.Entidades.Reserva;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Numero do Quarto: ");
        int numero = sc.nextInt();
        System.out.print("Data de CheckIn (dd/MM/yyyy): ");
        Date checkIn = sdf.parse(sc.next());
        System.out.print("Data de CheckOut (dd/MM/yyyy): ");
        Date checkOut = sdf.parse(sc.next());

        if (!checkOut.after(checkIn)) {
            System.out.println("Erro na Reserva: Data de CheckOut deve ser depois da Data de CheckIn");
        } else {
            Reserva reserva = new Reserva(numero, checkIn, checkOut);
            System.out.println("Reserva: " + reserva);

            System.out.println();
            System.out.println("Digite os dados para atualizar a Reserva: ");
            System.out.print("Data de CheckIn (dd/MM/yyyy): ");
            checkIn = sdf.parse(sc.next());
            System.out.print("Data de CheckOut (dd/MM/yyyy): ");
            checkOut = sdf.parse(sc.next());


            String erro = reserva.atualizaData(checkIn, checkOut);
            if (erro != null) {
                System.out.println("Erro na reserva: " + erro);
            } else {
                System.out.println("Reserva: " + reserva);
            }
        }
        sc.close();
    }

}

