package br.com.guikar.ufc.ed;

public class NoArvore {
    private int elemento;
    private NoArvore direita;
    private NoArvore esquerda;
    private NoArvore pai;

    public NoArvore(int elemento) {
        this.elemento = elemento;
    }

    public int getElemento() {
        return elemento;
    }

    public void setElemento(int elemento) {
        this.elemento = elemento;
    }

    public void setDireita(NoArvore direita) {
        this.direita = direita;
    }

    public void setEsquerda(NoArvore esquerda) {
        this.esquerda = esquerda;
    }

    public void setPai(NoArvore pai) {
        this.pai = pai;
    }

    public NoArvore getDireita() {
        return direita;
    }

    public NoArvore getEsquerda() {
        return esquerda;
    }

    public NoArvore getPai() {
        return pai;
    }

    public NoArvore sucessor(NoArvore no)
    {
        NoArvore sucessor = no;

        sucessor = sucessor.getDireita();

        while(sucessor.getEsquerda() != null)
            sucessor = sucessor.getEsquerda();

        return sucessor;
    }

    public NoArvore antecessor(NoArvore no)
    {
        NoArvore antecessor = no;

        antecessor = antecessor.getEsquerda();

        while(antecessor.getDireita() != null)
            antecessor = antecessor.getDireita();

        return antecessor;
    }
}
