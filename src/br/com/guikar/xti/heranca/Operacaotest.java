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
public class Operacaotest {
    public static void calcule(OperacaoMatematica o,double x,double y) {
        System.out.println(o.calcular(x, y));
    }
    public static void main(String[] args) {
        calcule(new soma(), 5, 5);
        calcule(new multiplicacao(), 5, 5);
    }
}
