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
public class Questao_2 {
    public static void main(String[]args){
        int num[]=new int[10];
        int resto[]=new int[10];
        int impar[]=new int[10];
        int par[]=new int[10];
        for(int i=0;i<num.length;i++){
            num[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
            resto[i]=num[i]%2;
            if(resto[i]==0){
                par[i]=num[i];
                System.out.println("O vetor "+(i+1)+" tem o valor "+num[i]+" e este valor é par.");
            }else{
                impar[i]=num[i];
                System.out.println("O vetor "+(i+1)+" tem o valor "+num[i]+" e este valor é impar.");
            }
        }
    }
}
