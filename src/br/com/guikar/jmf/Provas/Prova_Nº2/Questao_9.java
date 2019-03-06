/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.guikar.jmf.Provas.Prova_Nº2;

import javax.swing.JOptionPane;

/**
 *
 * @author infor2015
 */
public class Questao_9 {
    public static void main(String args[]) {  
        int x;
        x=Integer.parseInt(JOptionPane.showInputDialog("digite um numero: "));
        for(int i = x;i>0;i--){
            if(x%i==0){  
                System.out.println("os divisores do numero "+x+" São: "+i);  
            }  
        }  
    } 
}
