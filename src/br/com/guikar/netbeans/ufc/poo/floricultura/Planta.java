package br.com.guikar.netbeans.ufc.poo.floricultura;

public class Planta {
    private String nome;
    private int estoqueIdeal;
    private int totalEstoque;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome!=null)
            this.nome = nome;
    }

    public int getEstoqueIdeal() {
        return estoqueIdeal;
    }

    public void setEstoqueIdeal(int estoqueIdeal) {
        if(estoqueIdeal>0)
            this.estoqueIdeal = estoqueIdeal;
    }

    public int getTotalEstoque() {
        return totalEstoque;
    }

    public void setTotalEstoque(int totalEstoque) {
        if(totalEstoque>0)
            this.totalEstoque = totalEstoque;
    }
}
