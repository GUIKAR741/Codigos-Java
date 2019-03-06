package br.com.guikar.netbeans.ufc.poo.hora.horadocodigo;

public class Venda {
    private Produto produto;
    private Cliente cliente;
    private String data;

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        if(produto!=null)
            this.produto = produto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        if(cliente!=null)
            this.cliente = cliente;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        if(data.length()>10)
            this.data = data;
    }
}
