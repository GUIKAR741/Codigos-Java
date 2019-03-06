
package br.com.guikar.ufc.poo.hora.hora11.registrorecebimentos;

public class ItemVenda implements Recebivel {
    private String produto;
    private int quantidade;
    private double precoUnitario;

    public ItemVenda() {
    }

    public ItemVenda(String produto, int quantidade, double precoUnitario) {
        setProduto(produto);
        setQuantidade(quantidade);
        setPrecoUnitario(precoUnitario);
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        if(produto != null)
            this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if(quantidade > 0)
            this.quantidade = quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        if(precoUnitario > 0)
            this.precoUnitario = precoUnitario;
    }

    @Override
    public String toString() {
        String item="Item"+
                "\nNome: "+ getProduto()+
                "\nQuantidade: "+getQuantidade()+
                "\nPreço: "+getPrecoUnitario()+
                "\nReceita: "+totalizarReceita();
        return item;
    }

    @Override
    public double totalizarReceita(){
        return getQuantidade()*getPrecoUnitario();
    }
    
    
}
