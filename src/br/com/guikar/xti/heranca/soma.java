/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.guikar.xti.heranca;

/**
 *
 * @author Guilherme
 */
public class soma extends OperacaoMatematica {

    /**
     *
     * @param x
     * @param y
     * @return
     */
    @Override
    public double calcular(double x,double y){
        return x+y;
    }
}
