/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.guikar.netbeans.ufc.poo.termometro.controller;

import br.com.guikar.netbeans.ufc.poo.termometro.model.Cidade;
import br.com.guikar.netbeans.ufc.poo.termometro.view.Termometro;

/**
 *
 * @author Guilherme
 */
public class TermometroController {
    private Termometro view;
    private Cidade model;

    public TermometroController(Termometro view, Cidade model) {
        if(view!=null && model!=null){
            this.view = view;
            this.model = model;
        }
    }
    
}
