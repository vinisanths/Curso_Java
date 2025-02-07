package Enumeracoes.Exemplo1.Entidades;

public class Departamento {
    private String nome;

    private Departamento() {
    }

    public Departamento(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }




}
