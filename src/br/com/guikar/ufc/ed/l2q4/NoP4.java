package br.com.guikar.ufc.ed.l2q4;

public class NoP4 {
    private String elemento;
    private NoP4 proximo;
    private NoP4 anterior;

    public NoP4(String elemento) {
        this.elemento = elemento;
    }

    public String getElemento() {
        return elemento;
    }

    public void setProximo(NoP4 proximo) {
        this.proximo = proximo;
    }

    public void setAnterior(NoP4 anterior) {
        this.anterior = anterior;
    }

    public NoP4 getProximo() {
        return proximo;
    }

    public NoP4 getAnterior() {
        return anterior;
    }
}
