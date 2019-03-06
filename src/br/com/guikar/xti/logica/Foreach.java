/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.guikar.xti.logica;

import java.util.ArrayList;

/**
 *
 * @author Guilherme
 */
public class Foreach {
    public static void main(String[] args) {
        /*int pares[]={2,4,6,8};
        for(int par: pares){
            System.out.println(par);
        }*/
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<10;i++){
            list.add(i);
        }
        for(Integer numero:list){
            System.out.println(numero);
        }
    }
}
