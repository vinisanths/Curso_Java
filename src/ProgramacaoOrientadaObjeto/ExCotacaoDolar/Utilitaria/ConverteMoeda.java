package ProgramacaoOrientadaObjeto.ExCotacaoDolar.Utilitaria;

public class ConverteMoeda {

    public static final double IOF = 0.06;

    public static double cambio(double precoDolar, double quantiDolar){
        double totalDolar = quantiDolar * precoDolar;
        return totalDolar * ( 1 + IOF);
    }
}
