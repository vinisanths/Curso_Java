package ProgramacaoFuncional.ExPredicado.Entidades;

public class Produto {
    private String nome;
    private Double preco;

    public Produto(){
    }

    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public static boolean predicadoProdutoStatic(Produto produto){
        return produto.getPreco() >= 100;
    }

    public boolean predicadoProdutoNaoStatic(){
        return preco >= 100;
    }

    @Override
    public String toString(){
        return nome + ", " + String.format("%.2f", preco);
    }
}
