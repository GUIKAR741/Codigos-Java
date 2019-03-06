/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.guikar.xti.poo;

/**
 *
 * @author Guilherme
 */
public class GalinhaTest {
    public static void main(String[] args) {
        Galinha g1=new Galinha();
        g1.botar().botar().botar();
        Galinha g2=new Galinha();
        g2.botar().botar().botar().botar();
        System.out.println(Galinha.mediaDeOvos(2));
    }
}
