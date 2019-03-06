/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.guikar.jmf.tdlogica;

import javax.swing.JOptionPane;

/**
 *
 * @author JMF
 */
public class Questao22 {
    public static void main (String[]args){
        double maca;
        final double menosduzia=1.30 , duzia=1;
        maca=Double.parseDouble(JOptionPane.showInputDialog("Quantas Maças Deseja Comprar? "));
        if (maca<12){
            JOptionPane.showMessageDialog(null,"O Preço de Cada Maçã é R$ " + menosduzia 
                    +"0\n" + "Você Quer: "+maca 
                    +" Maçãs"+"\n"
                    +"Você Pagara: R$ "+maca*menosduzia);
        }
        if (maca>=12) {
            JOptionPane.showMessageDialog(null,"O Preço de Cada Maçã é R$ " + duzia 
                    +"\n"+"Você Quer: "+maca 
                    +" Maçãs"+"\n" 
                    +"Você Pagara: R$ "+maca*duzia);
        }
    }
}
