package br.com.guikar.netbeans.ufc.poo.eclusa.model;

import br.com.guikar.netbeans.ufc.poo.eclusa.exceptions.CargaMaximaException;
import br.com.guikar.netbeans.ufc.poo.eclusa.exceptions.MenorQueZeroException;
import br.com.guikar.netbeans.ufc.poo.eclusa.exceptions.NecessarioUmContainerException;

import java.util.ArrayList;

public class Balsa extends Embarcacao {
    private ArrayList<Container> containers;

    public Balsa() {
        containers = new ArrayList<>();
    }

    @Override
    public void calcularCarga() throws CargaMaximaException, NecessarioUmContainerException, MenorQueZeroException{
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
