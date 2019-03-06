/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.guikar.netbeans.jmf.Provas.Prova_Nº1;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */

public class Questao_1 {
    public static void main (String[]args){
        int cliente[]=new int[50];
        int filgratis[]=new int[100];
        for (int i =0;i<cliente.length;i++){
            cliente[i]=Integer.parseInt(JOptionPane.showInputDialog("Quantos filmes o cliente "+(i+1)+" alugou?\n (obs: a locadora tem 100 filmes) "));
            if (cliente[i]>=10 && cliente[i]<20){
                filgratis[i]+=1;
            }else if(cliente[i]>=20 && cliente[i]<30){
                filgratis[i]+=2;
            }else if(cliente[i]>=30 && cliente[i]<40){
                filgratis[i]+=3;
            }else if(cliente[i]>=40 && cliente[i]<50){
                filgratis[i]+=4;
            }else if(cliente[i]>=50 && cliente[i]<60){
                filgratis[i]+=5;
            }else if(cliente[i]>=60 && cliente[i]<70){
                filgratis[i]+=6;
            }else if(cliente[i]>=70 && cliente[i]<80){
                filgratis[i]+=7;
            }else if(cliente[i]>=80 && cliente[i]<90){
                filgratis[i]+=8;
            }else if (cliente[i]>=90 && cliente[i]<100){
                filgratis[i]+=9;
            }else if (cliente[i]==100){
                filgratis[i]+=10;
            }else{
                JOptionPane.showMessageDialog(null,"a locadora so tem 100 filmes");
            }
        }
        for (int i=0 ;i<cliente.length;i++){
            System.out.println("o cliente "+(i+1)+" alugou "+cliente[i]+" e tem direito a "+filgratis[i]+" filmes gratis.");
        }
    }
}
