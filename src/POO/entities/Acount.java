package POO.entities;

public class Acount {
    private int numeroConta;
    private String nome;

    private double saldo;

    public Acount(int numeroConta, String Nome) {
        this.numeroConta = numeroConta;
        this.nome = nome;
    }

    public Acount(int numeroConta, String nome, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.nome = nome;
        saldo = saldoInicial;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposito(double valor) {
        saldo += valor;
    }

    public void saque(double valor) {

    }

    public String toString() {
        return "Conta " +
                numeroConta +
                ", Nome: " +
                nome +
                ", Saldo: R$ " +
                saldo;
    }

}
