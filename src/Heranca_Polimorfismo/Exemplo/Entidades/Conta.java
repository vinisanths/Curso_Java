package Heranca_Polimorfismo.Exemplo.Entidades;

public class Conta {
    private Integer numero;
    private String titular;
    protected Double saldo;

    public Conta(){
    }

    public Conta(Integer numero, String nome, Double saldo) {
        this.numero = numero;
        this.titular = nome;
        this.saldo = saldo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getNome() {
        return titular;
    }

    public void setNome(String nome) {
        this.titular = nome;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void deposito (double valor){
        saldo += valor;
    }
    public void saque (double valor){
        saldo -= valor + 5.0;
    }
}
