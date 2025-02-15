package Heranca_Polimorfismo.Exercicio2.Entidades;

public class ContribuinteJuridico extends Contribuinte {

    private int numFuncionarios;

    public ContribuinteJuridico(){
    }

    public ContribuinteJuridico(String nome, Double rendaAnual, int numFuncionarios) {
        super(nome, rendaAnual);
        this.numFuncionarios = numFuncionarios;
    }

    public int getNumFuncionarios() {
        return numFuncionarios;
    }

    public void setNumFuncionarios(int numFuncionarios) {
        this.numFuncionarios = numFuncionarios;
    }

    @Override
    public double taxa() {

        if (numFuncionarios > 10){
            return rendaAnual * 0.14;
        }else {
            return rendaAnual * 0.16;
        }
    }
}
