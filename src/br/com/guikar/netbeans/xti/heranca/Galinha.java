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
public class Galinha extends Animal{

    public Galinha(double peso,String comida) {
        super(peso, comida);
    }
    @Override
    public void fazerBarulho(){
        System.out.println("có,có!");
    }
    
}
