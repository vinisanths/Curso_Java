package ProgramacaoOrientadaObjeto.POOExConta.entities;

public class Conta {
    private int numeroConta;
    private String nome;
    private double saldo;

    public Conta(int numeroConta, String nome) {
        this.numeroConta = numeroConta;
        this.nome = nome;
    }

    public Conta(int numeroConta, String nome, double depositoInicial) {
        this.nome = nome;
        this.numeroConta = numeroConta;
        depositar(depositoInicial);
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
    public void mudarNome(String nome){
        this.nome = nome;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Deposite um valor maior que 0");
        } else {
            saldo += valor;
        }
    }

    public void sacar(double valor) {
         this.saldo -= (valor + 5.0);
    }

    public String toString() {
        return "Conta " +
                numeroConta +
                ", Nome: " +
                nome +
                ", Saldo: R$ " +
                String.format("%.2f", saldo);
    }
}
