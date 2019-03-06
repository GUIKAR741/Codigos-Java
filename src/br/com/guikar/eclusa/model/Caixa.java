package br.com.guikar.eclusa.model;

import java.util.ArrayList;

public class Caixa {
    private float total;
    private ArrayList<Registro> historico = new ArrayList<>();

    public ArrayList<Registro> getHistorico() {
        return historico;
    }

    public void addRegistro(Registro reg){
        historico.add(reg);
    }
    
    public float getTotal() {
        return total;
    }

    public void calculaTotal(){
        float soma=0;
        for (int i = 0; i < historico.size(); i++) {
            soma+=historico.get(i).getPreco();
        }
        total=soma;
    }
}
