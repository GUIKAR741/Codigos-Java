package br.com.guikar.ufc.ed;

public class No {
    private int elemento;
    private No proximo;
    private No anterior;

    public No(int elemento) {
        this.elemento = elemento;
    }

    public int getElemento() {
        return elemento;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    public void setAnterior(No anterior) {
        this.anterior = anterior;
    }

    public No getProximo() {
        return proximo;
    }

    public No getAnterior() {
        return anterior;
    }
}
