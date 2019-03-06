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
public class Questao8 {
    public static void main (String[]args){
        double realrs , dolaruss , taxa;
        realrs=Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor de Reais que Deseja Converter:"));
        taxa=Double.parseDouble(JOptionPane.showInputDialog("Digite a Cotação do Dolar Atual:"));
        dolaruss=(realrs/taxa);
        JOptionPane.showMessageDialog(null,"Quantidade de Dolares Ápos a Conversão: "+dolaruss);
    }
}
