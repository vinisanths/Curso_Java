package Interfaces.ExSemInterface.Modelo.Servicos;

public class TaxaServicoBrasil {


    public double Taxa(double valor){

        if (valor <= 100.0){
            return valor * 0.2;
        }else {
            return valor * 0.15;
        }
    }
}
