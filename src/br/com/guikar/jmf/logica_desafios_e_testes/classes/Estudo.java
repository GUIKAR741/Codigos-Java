/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.guikar.jmf.logica_desafios_e_testes.classes;

import javax.swing.JOptionPane;

/**
 *
 * @author Guilherme
 */
public class Estudo {
    public static void main(String[] args) {
        int numeros[]=new int[7];
        //0,1,2,3,4,5,6,7,8,9
        for(int i=0;i<numeros.length;i++){
            numeros[i]=Integer.parseInt(JOptionPane.showInputDialog("DIGITE UM NUMERO"));
            if((numeros[i]%2)==0){        
                System.out.println("par");
            }else{
                System.out.println("impar");
            }
        }

    }
}
