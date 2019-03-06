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
public class Questao_3 {
    public static void main(String[]args){
        int cartelagabarito[] = new int[13];
        int cartelaaposta []= new int[13];
        int acertos = 0;
        for(int i=0;i<cartelagabarito.length;i++){
            cartelaaposta[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite a sua aposta "+(i+1)+"/13: "));
        }
        for(int i=0;i<cartelaaposta.length;i++){
            cartelagabarito[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite o resultado da aposta "+(i+1)+"/13: "));
        }
        for(int i=0;i<cartelaaposta.length;i++){
            if (cartelagabarito[i]==cartelaaposta[i]){
                acertos=acertos+1;
            }
        }
        if (acertos==13){
                System.out.println("Parabens você acertou todas as questoes!");
            }else{
                System.out.println("Você acertou "+acertos+" questoes!");
            }
    }
}
