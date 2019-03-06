/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.guikar.netbeans.jmf.tdlogica;

import javax.swing.JOptionPane;

/**
 *
 * @author JMF
 */
public class Questao10 {
    public static void main (String[]args){
        double produto,parcela;
        produto=Double.parseDouble(JOptionPane.showInputDialog("Digite o Preço do Produto:"));
        parcela=(produto)/5;
        JOptionPane.showMessageDialog(null,"Preço Por Parcela é: "+parcela);
    }
}
