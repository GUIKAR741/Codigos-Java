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
public class Questao_1 {
    public static void main(String[]args){
        int cliente[]=new int[10];
        int filgratis[]=new int[10];
        for (int i =0;i<cliente.length;i++){
            cliente[i]=Integer.parseInt(JOptionPane.showInputDialog("Quantos filmes o cliente "+(i+1)+" alugou?"));
            filgratis[i]=cliente[i]/10;
        }
        for (int i=0 ;i<cliente.length;i++){
            System.out.println("o cliente "+(i+1)+" alugou "+cliente[i]+" e tem direito a "+filgratis[i]+" filmes gratis.");
        }
    }
}
