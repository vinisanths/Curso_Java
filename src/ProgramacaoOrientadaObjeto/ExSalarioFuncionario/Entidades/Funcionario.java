package ProgramacaoOrientadaObjeto.ExSalarioFuncionario.Entidades;

public class Funcionario {
    public String nome;
    public double salarioBruto;
    public double taxa;

    public double descontaSalario(){
        double salarioLiquido = salarioBruto - taxa;
        return salarioLiquido;
    }

    public void incrementaSalario(double porcentagem){
      salarioBruto += (salarioBruto * (porcentagem / 100) - taxa);
    }

    public String toString(){
        return "Funcionario: "
                + nome
                + ", R$ "
                + descontaSalario();
    }
}
