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
public class Questao9 {
    public static void main (String []args){
        double deposito,rendimento,saldo;
        final double taxa=0.70;
        deposito=Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor a Ser Depositado:"));
        rendimento=(deposito*taxa);
        saldo=(rendimento+deposito);
        JOptionPane.showMessageDialog(null,"Rendimento Por Més: "+rendimento+"\n"+"Seu Saldo É: "+saldo);
    }
}
