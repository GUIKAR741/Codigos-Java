package br.com.guikar.netbeans.ufc.poo.hora.hora09.Q1;
public class IngressoNormal extends Ingresso{
    private String tipoIngresso = "normal";
    public IngressoNormal() {
        super();
    }
    public IngressoNormal(float preco, String descricaoFilme, String sala) {
        super(preco, descricaoFilme, sala);
    }
    public IngressoNormal(float preco, String descricaoFilme, String sala, int quantidade) {
        super(preco, descricaoFilme, sala, quantidade);
    }
    public String getTipo() {
        return tipoIngresso;
    }
}
