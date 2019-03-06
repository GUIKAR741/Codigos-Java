package br.com.guikar.netbeans.ufc.so;

public class No<E> {
    private E elemento;
    private No<E> proximo;
    private No<E> anterior;

    public No(E elemento) {
        this.elemento = elemento;
    }

    public E getElemento() {
        return elemento;
    }

    public void setProximo(No<E> proximo) {
        this.proximo = proximo;
    }

    public void setAnterior(No<E> anterior) {
        this.anterior = anterior;
    }

    public No<E> getProximo() {
        return proximo;
    }

    public No<E> getAnterior() {
        return anterior;
    }
}
