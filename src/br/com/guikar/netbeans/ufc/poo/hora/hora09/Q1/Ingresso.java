package br.com.guikar.netbeans.ufc.poo.hora.hora09.Q1;
public class Ingresso {
    private float preco;
    private String descricaoFilme;
    private String sala;
    private int quantidade;
    public Ingresso() {
        super();
    }
    public Ingresso(float preco, String descricaoFilme, String sala) {
        setPreco(preco);
        setDescricaoFilme(descricaoFilme);
        setSala(sala);
    }
    public Ingresso(float preco, String descricaoFilme, String sala, int quantidade) {
        this(preco,descricaoFilme,sala);
        setQuantidade(quantidade);
    }
    public float getPreco() {
        return preco;
    }
    public void setPreco(float preco) {
        if(preco > 0)
            this.preco = preco;
    }
    public String getDescricaoFilme() {
        return descricaoFilme;
    }
    public void setDescricaoFilme(String descricaoFilme) {
        if(descricaoFilme != null)
            this.descricaoFilme = descricaoFilme;
    }
    public String getSala() {
        return sala;
    }
    public void setSala(String sala) {
        if(sala != null)
            this.sala = sala;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        if(quantidade>=0)
            this.quantidade = quantidade;
    }
}