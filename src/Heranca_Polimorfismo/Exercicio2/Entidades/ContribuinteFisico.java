package Heranca_Polimorfismo.Exercicio2.Entidades;

public class ContribuinteFisico extends Contribuinte {

    private Double gastosSaude;

    public ContribuinteFisico() {
        super();
    }

    public ContribuinteFisico(String nome, Double rendaAnual, Double gastosSaude) {
        super(nome, rendaAnual);
        this.gastosSaude = gastosSaude;
    }

    @Override
    public double taxa() {
        double resultado;
        if (rendaAnual <= 20000.00){
            resultado = (rendaAnual * 0.15) - (gastosSaude * 0.5);
            return resultado;
        }else {
            resultado = (rendaAnual * 0.25) - (gastosSaude * 0.5);
            return resultado;
        }
    }


}
