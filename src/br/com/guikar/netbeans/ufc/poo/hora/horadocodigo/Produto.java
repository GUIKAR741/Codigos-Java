package br.com.guikar.netbeans.ufc.poo.hora.horadocodigo;

public class Produto {
    private String nome;
    private String estado;
    private float preco;
    private int quantidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.length()>5)
            this.nome = nome;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        if(estado.length()>3)
            this.estado = estado;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        if(preco>0)
            this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if(quantidade>0)
            this.quantidade = quantidade;
    }
}
