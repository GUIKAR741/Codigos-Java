/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.guikar.jmf.logica_desafios_e_testes.classes;

import javax.swing.JOptionPane;

/**
 *
 * @author Familia
 */
public class Adivinha {
    public static void main(String[] args) {
        double pense,num;
        JOptionPane.showMessageDialog(null,"Pense em um numero!");
        JOptionPane.showMessageDialog(null,"Multiplique por 2!");
        JOptionPane.showMessageDialog(null,"Some 6!");
        JOptionPane.showMessageDialog(null,"Divida por 2!");
        pense=Integer.parseInt(JOptionPane.showInputDialog("Digite o numero Final:"));
        num=(pense*2-6)/2;
        JOptionPane.showMessageDialog(null,"O numero pensado foi "+(num)+ "!");
    }
}
