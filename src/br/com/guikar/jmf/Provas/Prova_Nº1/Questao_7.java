/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.guikar.jmf.Provas.Prova_Nº1;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Questao_7 {
    public static void main(String []args){
        int idade[]=new int[10];
        for(int i=0;i<idade.length;i++){
            idade[i]=Integer.parseInt(JOptionPane.showInputDialog("digite a idade da pessoa "+(i+1)+": "));
        }
        for(int i=0;i<idade.length;i++){
            if (idade[i]>=18){
                System.out.println("A idade da pessoa "+(i+1)+" é: "+idade[i]+". Esta pessoa é maior de idade.");
            }else{
                System.out.println("A idade da pessoa "+(i+1)+" é: "+idade[i]+". Esta pessoa é menor de idade.");
            }
        }
    }
}
