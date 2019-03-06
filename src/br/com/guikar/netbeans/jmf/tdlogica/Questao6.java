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
public class Questao6 {
    public static void main (String[]args){
        int a,b,troca;
        a=Integer.parseInt(JOptionPane.showInputDialog("Digite um Valor Para A:"));
        b=Integer.parseInt(JOptionPane.showInputDialog("Digite um Valor Para B:"));
        troca=(a);
        a=(b);
        b=(troca);
        JOptionPane.showMessageDialog(null,"Novo Valor de A: "+ a +"\n"
                +"Novo Valor de B: "+b);
    }
}
