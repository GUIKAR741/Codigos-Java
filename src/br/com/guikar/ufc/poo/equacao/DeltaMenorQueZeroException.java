package br.com.guikar.ufc.poo.equacao;

public class DeltaMenorQueZeroException extends Exception {
    public DeltaMenorQueZeroException() {
        super("Delta é menor que zero");
    }
}
