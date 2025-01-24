package Arrays.DadosPessoas.Entidades;

public class Pessoas {
    private char sexo;
    private double altura;

    public Pessoas(char sexo, double altura) {
        this.sexo = sexo;
        this.altura = altura;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
