package TratamentoDeExcecoes.ExSolucaoBoa.Aplicacao;

import TratamentoDeExcecoes.ExSolucaoBoa.Modelo.Entidades.Reserva;
import TratamentoDeExcecoes.ExSolucaoBoa.Modelo.Excecoes.ExcecaoDeDominio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.print("Informe o Numero do Quarto: ");
            int numero = sc.nextInt();
            System.out.print("Data de CheckIn (dd/MM/yyyy): ");
            Date checkIn = sdf.parse(sc.next());
            System.out.print("Data de CheckOut (dd/MM/yyyy): ");
            Date checkOut = sdf.parse(sc.next());

            Reserva reserva = new Reserva(numero, checkIn, checkOut);
            System.out.println("Reserva: " + reserva);

            System.out.println();
            System.out.print("Data de CheckIn (dd/MM/yyyy): ");
            checkIn = sdf.parse(sc.next());
            System.out.print("Data de CheckOut (dd/MM/yyyy): ");
            checkOut = sdf.parse(sc.next());
            System.out.println("Reserva: " + reserva);

            reserva.atualizaData(checkIn, checkOut);
            System.out.println("Reserva: " + reserva);
        }
        catch (ParseException e){
            System.out.println("Formato de Data Invalido! ");
        }
        catch (ExcecaoDeDominio e){
            System.out.println("Erro na Reserva: " + e.getMessage());
        }
        catch ( RuntimeException e) {
            System.out.println("Erro Inesperado! ");
        }
        sc.close();
    }
}
