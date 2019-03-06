/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.guikar.jmf.tdlogica;

import javax.swing.JOptionPane;

/**
 *
 * @author JMF
 */
public class Questao1 {
    public static void main (String [] args){
        int n1,n2,soma;
        n1=Integer.parseInt(JOptionPane.showInputDialog("Digite um Numero Para Somar: "));
        n2=Integer.parseInt(JOptionPane.showInputDialog("Digite outro Numero Para Somar: "));
        soma=(n1+n2);
        JOptionPane.showMessageDialog(null,"resultado da soma é: "+ soma);
    }
}
