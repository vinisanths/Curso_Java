package ProgramacaoOrientadaObjeto.ExercicioEstoque.Entidade;

public class Produto {
    public String nome;
    public double preco;
    public int quantidade;

    public double valorTotalEmEstoque(){
        return preco * quantidade;
    }

    public void adicionaProduto(int quantidade){
        this.quantidade += quantidade;
    }

    public void removerProduto(int quantidade){
        this.quantidade -= quantidade;
    }

    @Override
    public String toString() {
        return nome
                + ", R$"
                +String.format("%.2f", preco)
                +", "
                +quantidade
                +" Unidades, Total: R$: "
                +String.format("%.2f", valorTotalEmEstoque());
    }
}
