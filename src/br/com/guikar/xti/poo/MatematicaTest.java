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
public class MatematicaTest {
    public static void main(String[] args) {
        Matematica m=new Matematica();
        int ma=m.maior(10, 20);
        double so=m.soma(10, 20,30,40,50);
        int ra=m.raiz(2);
        System.out.println(m.media(5,4,4));
    }
}
