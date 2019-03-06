package br.com.guikar.netbeans.ufc.poo.eclusa.model;

import br.com.guikar.netbeans.ufc.poo.eclusa.exceptions.MenorQueZeroException;
import br.com.guikar.netbeans.ufc.poo.eclusa.exceptions.VazioException;

public class Pessoa {
    private float peso;
    private String nome;

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) throws MenorQueZeroException {
        if (peso > 0)
            this.peso = peso;
        else
            throw new MenorQueZeroException("Peso");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws VazioException {
        if (nome != null && !nome.equals(""))
            this.nome = nome;
        else
            throw new VazioException("Nome");
    }
}
