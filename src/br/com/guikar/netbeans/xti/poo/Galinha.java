/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.guikar.netbeans.xti.poo;

/**
 *
 * @author Guilherme
 */
public class Galinha {
    private int ovos;
    private static int ovosDaGraja;
    
    public Galinha botar(){
        this.ovos++;
        Galinha.ovosDaGraja++;
        return this;
    }
    public static double mediaDeOvos(int galinhas){
        return Galinha.ovosDaGraja/galinhas;
    }
}
