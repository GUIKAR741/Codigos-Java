/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.guikar.ufc.poo.termometro.controller;

import br.com.guikar.ufc.poo.termometro.model.Cidade;
import br.com.guikar.ufc.poo.termometro.view.TermometroCidade;

/**
 *
 * @author Guilherme
 */
public class TermometroCidadeController {
    private Cidade model;
    private TermometroCidade view;

    public TermometroCidadeController(Cidade model, TermometroCidade view) {
        if(model!=null && view!=null){
            this.model = model;
            this.view = view;
        }
    }
    
}
