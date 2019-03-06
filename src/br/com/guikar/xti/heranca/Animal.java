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
public abstract class Animal {
    private double peso;
    private String comida;
    
    public Animal(double peso,String comida){
        this.peso=peso;
        this.comida=comida;
    }
    
    public void dormir(){System.out.println("Dormiu");}
    public abstract void fazerBarulho();
}
