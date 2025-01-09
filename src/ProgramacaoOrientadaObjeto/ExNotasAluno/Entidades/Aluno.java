package ProgramacaoOrientadaObjeto.ExNotasAluno.Entidades;
public class Aluno {

    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;
    public double somaDasNotas;

    public double somaNota(){
        return somaDasNotas = nota1+nota2+nota3;
    }

    public void calculaMedia(){
        if (somaDasNotas > 60){
            System.out.printf("Nota Final: " + somaDasNotas + " PASSOU");
        }else{
            System.out.printf("Nota Final: " + somaDasNotas + " REPPROVOU"
                    + " Faltaram: " + (60 - somaDasNotas));
        }
    }
}
