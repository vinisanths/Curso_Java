package TratamentoDeExcecoes.Exercicio.Modelo.Entidades;

import TratamentoDeExcecoes.Exercicio.Modelo.Excecao.ExcecaoDeDominio;

public class Conta {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;
    
    public Conta(){
    }

    public Conta(Integer number, String holder, Double amount, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = amount;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    
    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }
    
    public void deposit(Double amount){
        this.balance = amount;
    }
    
    public void withdraw(Double amount) throws ExcecaoDeDominio {
        if (amount > balance){
            throw new ExcecaoDeDominio(" Saldo Insuficiente para Saque! ");
        } else if (amount > withdrawLimit) {
            throw new ExcecaoDeDominio(" O valor excede o limite de Saque! ");
        }
        else {
            balance -= amount;
        }
    }


}
