/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.guikar.netbeans.ufc.poo.mvc;

import java.awt.event.ActionEvent;

/**
 *
 * @author Guilherme
 */
public class TelaPrincipalConfiguracaoController{
    private Placar model;
    private TelaPrincipalConfiguracao view;

    public TelaPrincipalConfiguracaoController(Placar model, TelaPrincipalConfiguracao view) {
        if(model!=null && view!=null){
            this.model = model;
            this.view = view;
        }
    }
    public void acao(ActionEvent e){
        switch(e.getActionCommand()){
            case "Adicionar Times":
                String time1=view.getTxtTime1(),time2=view.getTxtTime2();
                new TelaPlacar(model);
                model.setTime(1, time1);
                model.setTime(2, time2);
                break;
            case "Aumentar Placar 1":
                model.addPonto(1);
                break;
            case "Aumentar Placar 2":
                model.addPonto(2);
                break;
        }
    }
}
