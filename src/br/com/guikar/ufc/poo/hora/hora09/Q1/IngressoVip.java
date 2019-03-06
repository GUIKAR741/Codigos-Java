package br.com.guikar.ufc.poo.hora.hora09.Q1;
public class IngressoVip extends Ingresso{
    private String tipoIngresso = "vip";
    public IngressoVip() {
        super();
    }
    public IngressoVip(float preco, String descricaoFilme, String sala) {
        super(preco, descricaoFilme, sala);
    }
    public IngressoVip(float preco, String descricaoFilme, String sala, int quantidade) {
        super(preco, descricaoFilme, sala, quantidade);
    }
    public String getTipoIngresso() {
        return tipoIngresso;
    }
}
