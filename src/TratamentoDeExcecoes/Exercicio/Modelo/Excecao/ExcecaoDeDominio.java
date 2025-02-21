package TratamentoDeExcecoes.Exercicio.Modelo.Excecao;

public class ExcecaoDeDominio extends RuntimeException {
    public ExcecaoDeDominio (String msg){
        super(msg);
    }
}
