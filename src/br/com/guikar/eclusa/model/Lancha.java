package br.com.guikar.eclusa.model;

import br.com.guikar.eclusa.exceptions.CargaMaximaException;
import br.com.guikar.eclusa.exceptions.MenorQueZeroException;
import br.com.guikar.eclusa.exceptions.NecessarioUmContainerException;

import java.util.ArrayList;

public class Lancha extends Embarcacao {
    private ArrayList<Pessoa> pessoas;

    public Lancha() {
        pessoas = new ArrayList<>();
    }

    @Override
    public void calcularCarga() throws CargaMaximaException, NecessarioUmContainerException, MenorQueZeroException{
        float carga = 0;
        if (getPessoas().isEmpty())
            throw new NecessarioUmContainerException();
        for (int i = 0; i < getPessoas().size(); i++) {
            carga += getPessoas().get(i).getPeso();
        }
        if (carga > getCargaMaxima()) {
            throw new CargaMaximaException();
        }else{
            setCargaAtual(carga);
        }
    }


    public ArrayList<Pessoa> getPessoas() {
        return pessoas;
    }

}
