package Enumeracoes.ExercicioLoja.Entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Date momento;
    private StatusPedido status;
    private Cliente cliente;


    List<ItemPedido> itemPedidos = new ArrayList<>();

    public Pedido() {
    }

    public Pedido(Date momento, StatusPedido status, Cliente cliente) {
        this.momento = momento;
        this.status = status;
        this.cliente = cliente;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public List<ItemPedido> getItemPedidos() {
        return itemPedidos;
    }

    public void removeProduto(ItemPedido item) {
        itemPedidos.remove(item);
    }

    public void adicionaProduto(ItemPedido item) {
        itemPedidos.add(item);
    }


    public double total() {
        double soma = 0;
        for (ItemPedido item : itemPedidos) {
            soma += item.subTotal();
        }
        return soma;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Resumo das Compras: ").append("\n");
        sb.append("Momento do Pedido: ");
        sb.append(sdf.format(momento)).append("\n");
        sb.append("Status do Pedido: ");
        sb.append(status).append("\n");
        sb.append(cliente).append("\n");
        for (ItemPedido item : itemPedidos) {
            sb.append(item).append("\n");
        }
        sb.append("Total: ").append(total());

        return sb.toString();
    }
}
