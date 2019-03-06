/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.guikar.netbeans.xti.logica;

/**
 *
 * @author Guilherme
 */
public class Fibonacci {
    public static void main(String[] args) {
        int ant=0,prox=1;
        System.out.print(ant);
        while(prox<=100){
            System.out.print(", "+prox);
            prox=prox+ant;//Proximo Num de Fibonacci
            ant=prox-ant;//Atualizando o Numero Anterior
        }System.out.println();
    }
}
