package br.com.guikar.eclusa.controller;

import br.com.guikar.eclusa.model.Eclusa;
import br.com.guikar.eclusa.view.EclusaView;
import br.com.guikar.eclusa.view.GerenciamentoEclusaView;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class GerenciamentoEclusaController {

    private GerenciamentoEclusaView view;
    private Eclusa model;

    public GerenciamentoEclusaController(GerenciamentoEclusaView view, Eclusa model) {
        if (view != null && model != null) {
            this.model = model;
            this.view = view;
        }
    }

    public void acao(ActionEvent evt) {
        switch (evt.getActionCommand()) {
            case "<html><p style=\"text-align:center;\">Iniciar Eclusa</p></html>":
                eclusaAltera();
                break;
            case "Atualizar Eclusa":
                eclusaAltera();
                break;
        }
    }

    private void eclusaAltera() {
        boolean podeProsseguir = true;
        EclusaView telaEclusa=new EclusaView(model);
        try {
            float capMax=view.getTxtCapMax(),capMin=view.getTxtCapMin(),vazao=view.getTxtVazao();
            if(capMax>capMin && vazao<=(capMax-capMin) && capMax!=capMin){
                model.setLargura(view.getTxtLargura());
                model.setComprimento(view.getTxtComprimento());
                model.setVazao(vazao);
                model.setCapacidadeMaxima(capMax);
                model.setCapacidadeMinima(capMin);
            }else{
                podeProsseguir=false;
                if(capMax<capMin){
                    view.mensagem("Erro","Capacidade Maxima deve ser Maior que a Minima!", JOptionPane.ERROR_MESSAGE);
                }
                if(capMax==capMin){
                    view.mensagem("Erro","Capacidade Maxima deve ser Diferente da Minima!", JOptionPane.ERROR_MESSAGE);
                }
                if(vazao>(capMax-capMin)){
                    view.mensagem("Erro","Vazao deve ser menor que a Capacidade Maxima menos a Minima!", JOptionPane.ERROR_MESSAGE);
                }
                System.out.println("teste");
                telaEclusa.dispose();
            }
        } catch (Exception ex) {
            view.mensagem("Erro", ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            podeProsseguir = false;
            telaEclusa.dispose();
        }
        if (podeProsseguir) {
            telaEclusa.setVisible(true);
            view.dispose();
        }
    }

}
