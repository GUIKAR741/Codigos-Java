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
public class Questao_7 {
    public static void main(String[] args) {
        int x;
        x=Integer.parseInt(JOptionPane.showInputDialog("digite um numero: "));
        if (x % 2 != 0 & x % 3 != 0){ 
            System.out.println("O número "+x+" é primo!");
        }else if (x == 2 ^ x == 3) { 
            System.out.println("O número "+x+" é primo!");
        }else if (x == 0){ 
            System.out.println("Insira um número maior que 0!");
        }else if (x == 1) { 
            System.out.println("O número "+x+" não é primo!");
        }else { 
            System.out.println("O número "+x+" não é primo!");
        } 
    }
}