/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.guikar.netbeans.jmf.Provas.Prova_Nº2;

import javax.swing.JOptionPane;

/**
 *
 * @author infor2015
 */
public class Questao_5 {
    public static void main(String[] args){
        int num1 = 1, num2 = 0,x;
        x=Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de termos da serie de fibonacci: "));
        System.out.println(num2+" ");
        System.out.println(num1+" ");
        for(int i = 0; i <=x ; i++){
            num1 = num1 + num2;
            num2 = num1 - num2;
            System.out.println(num1+" ");
        }
    }
}
