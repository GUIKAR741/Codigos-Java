package br.com.guikar.eclusa.model;

import br.com.guikar.eclusa.exceptions.CargaMaximaException;
import br.com.guikar.eclusa.exceptions.MenorQueZeroException;
import br.com.guikar.eclusa.exceptions.NecessarioUmContainerException;

import java.util.ArrayList;

public class Cargueiro extends Embarcacao {
    private ArrayList<Container> containers;

    public Cargueiro() {
        containers = new ArrayList<>();
    }
    
    @Override
    public void calcularCarga() throws CargaMaximaException, NecessarioUmContainerException, MenorQueZeroException {
        float carga = 0;
        if (getContainers().isEmpty())
            throw new NecessarioUmContainerException();
        for (int i = 0; i < getContainers().size(); i++) {
            carga += getContainers().get(i).getPeso();
        }
        if (carga > getCargaMaxima()) {
            throw new CargaMaximaException();
        }else{
            setCargaAtual(carga);
        }
    }

    public ArrayList<Container> getContainers() {
        return containers;
    }

}
