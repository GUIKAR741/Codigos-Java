package br.com.guikar.netbeans.ufc.ed;

public class NoArvore {
    private int elemento;
    private NoArvore direita;
    private NoArvore esquerda;

    public NoArvore(int elemento) {
        this.elemento = elemento;
    }

    public int getElemento() {
        return elemento;
    }

    public void setDireita(NoArvore direita) {
        this.direita = direita;
    }

    public void setEsquerda(NoArvore esquerda) {
        this.esquerda = esquerda;
    }

    public NoArvore getDireita() {
        return direita;
    }

    public NoArvore getEsquerda() {
        return esquerda;
    }
}
