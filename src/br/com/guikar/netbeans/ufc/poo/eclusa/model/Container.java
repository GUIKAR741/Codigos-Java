package br.com.guikar.netbeans.ufc.poo.eclusa.model;

import br.com.guikar.netbeans.ufc.poo.eclusa.exceptions.MenorQueZeroException;

public class Container {
    private float peso;
    private int codigo;

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) throws MenorQueZeroException {
        if (peso > 0)
            this.peso = peso;
        else
            throw new MenorQueZeroException("Peso");
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) throws MenorQueZeroException {
        if (codigo > 0)
            this.codigo = codigo;
        else
            throw new MenorQueZeroException("Codigo");
    }
}
