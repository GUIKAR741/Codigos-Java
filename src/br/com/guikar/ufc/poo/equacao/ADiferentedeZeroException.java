package br.com.guikar.ufc.poo.equacao;

public class ADiferentedeZeroException extends Exception {
    public ADiferentedeZeroException() {
        super("Coeficiente A deve ser diferente de 0");
    }
}
