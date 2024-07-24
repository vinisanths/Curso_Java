package ExerciciosFixacao;

public class Exercicio1 {
    public static void main(String[] args) {
        String produto1 = "Computador";
        String produto2 = "Mesa de Escritorio";

        int age = 30;
        int code = 5290;
        char gender = 'F';
        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;


        System.out.println("Products: ");
        System.out.println(produto1 + ", which price is " + price1);
        System.out.println(produto2 +", wich price is"+ price2);
        System.out.println( "record: "+ age+ " years old, code "+code+ " and gender: " +gender);
        System.out.println("Measue with eight decimal palaces:" + measure);
        System.out.println("Rouded (three decimal places: )"  + measure);
    }
}
