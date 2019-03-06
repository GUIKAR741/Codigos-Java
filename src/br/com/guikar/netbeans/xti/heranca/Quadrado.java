/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.guikar.netbeans.xti.heranca;

/**
 *
 * @author Guilherme
 */
public class Quadrado implements AreaCalculavel{
    double lado;
    public Quadrado(double lado) {
        this.lado=lado;
    }
    
    @Override
    public double calculaArea() {
        return lado*lado;
    }
    
}
