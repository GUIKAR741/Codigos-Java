/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.guikar.netbeans.ufc.poo.mvc;

/**
 *
 * @author Guilherme
 */
public class TelaPlacarController{
    private Placar model;
    private TelaPlacar view;

    public TelaPlacarController(Placar model, TelaPlacar view) {
        if(model!=null && view!=null){
            this.model = model;
            this.view = view;
        }
    }
}
