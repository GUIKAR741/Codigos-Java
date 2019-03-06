/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.guikar.ufc.poo.termometro.controller;

import br.com.guikar.ufc.poo.termometro.model.Cidade;
import br.com.guikar.ufc.poo.termometro.view.ConfiguraClima;
import br.com.guikar.ufc.poo.termometro.view.Termometro;
import br.com.guikar.ufc.poo.termometro.view.TermometroCidade;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

/**
 *
 * @author Guilherme
 */
public class ConfiguraClimaController {
    private ConfiguraClima view;
    private Cidade model;
    private ArrayList<Object> telas=new ArrayList<>();
   
    public ConfiguraClimaController() {
    }
    
    public ConfiguraClimaController(ConfiguraClima view, Cidade model) {
        if(view!=null && model!=null){
            this.view = view;
            this.model = model;
        }
    }
    
    public void acao(ActionEvent evt){
        int tipoTemp=view.getTipoTemperatura(),tClima=view.getTipoClima();
        float temperatura=view.getTemperatura();
        String nome=view.getCidade(),uf=view.getUf(),clima=tClima==0?"sol":tClima==1?"chuva":"nublado";
        switch(evt.getActionCommand()){
            case "Adicionar Cidade":
                new ConfiguraClima(new Cidade()).setVisible(true);
                break;
            case "Adicionar Termometro":
                Termometro term=new Termometro(model);
                telas.add(term);
                term.setVisible(true);
                model.setNome(nome);
                model.setClima(clima);
                model.setUf(uf);
                model.setTipoTemperatura(tipoTemp);
                model.setTemperatura(temperatura);
                break;
            case "Adicionar Termometro Clima":
                TermometroCidade ter=new TermometroCidade(model);
                ter.setVisible(true);
                telas.add(ter);
                model.setClima(clima);
                model.setNome(nome);
                model.setUf(uf);
                model.setTipoTemperatura(tipoTemp);
                model.setTemperatura(temperatura);
                break;
            case "Atualizar Informações Cidade ":
                model.setNome(nome);
                model.setUf(uf);
                model.setClima(clima);
                model.setTipoTemperatura(tipoTemp);
                model.setTemperatura(temperatura);
                break;
            case "Aumentar Temperatura":
                model.aumentarTemperatura();
                break;
            case "Diminuir Temperatura":
                model.dimuirTemperatura();
                break;
            case "Fechar":
                this.dispose();
                view.dispose();
                break;
        }
    }
    public void dispose(){
        for (int i = 0; i < telas.size(); i++) {
            ((javax.swing.JFrame)telas.get(i)).dispose();
        }
    }
}
