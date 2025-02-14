package Heranca_Polimorfismo.Exercicio.Entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class ProdutoUsado extends Produto {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private Date dataFabricacao;

    public ProdutoUsado() {
        super();
    }

    public ProdutoUsado(String nome, Double preco, Date dataFabricacao) {
        super(nome, preco);
        this.dataFabricacao = dataFabricacao;
    }

    public Date getdataFabricacao() {
        return dataFabricacao;
    }

    public void setdataFabricacao(Date dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    @Override
    public final String tag(){
        return getNome() + " (Usado) R$ " + String.format("%.2f", getPreco()) + " (Data Fabricação: " + sdf.format(dataFabricacao) + " )";
    }
}