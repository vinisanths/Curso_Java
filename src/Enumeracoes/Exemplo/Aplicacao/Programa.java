package Enumeracoes.Exemplo.Aplicacao;

import Enumeracoes.Exemplo.Entidades.Pedido;
import Enumeracoes.Exemplo.Enum.StatusPedido;


import java.util.Date;

public class Programa {
    public static void main(String[] args) {

        Pedido pedido1 = new Pedido(1, new Date(), StatusPedido.PAGAMENTO_PENDENTE);

        System.out.println(pedido1);

        StatusPedido os1 = StatusPedido.ENVIADO;
        StatusPedido os2 = StatusPedido.valueOf("ENTREGUE");

        System.out.println(os1);
        System.out.println(os2);
    }
}
