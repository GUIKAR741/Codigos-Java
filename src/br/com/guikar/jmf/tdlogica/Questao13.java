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
public class Questao13 {
    public static void main (String[]args){
        int n1,n2;
        n1=Integer.parseInt(JOptionPane.showInputDialog("Digite o 1º Numero: "));
        n2=Integer.parseInt(JOptionPane.showInputDialog("Digite o 2º Numero: "));
        if (n1==n2){
            JOptionPane.showMessageDialog(null,"Os Numeros são Iguais");
        }else{
            if (n1>n2){
            JOptionPane.showMessageDialog(null,"Esses Numeros são Diferentes: "+n1+" é Maior que "+n2);
            }
            if (n1<n2){
                JOptionPane.showMessageDialog(null,"Esses Numeros são Diferentes: "+n2+" é Maior que "+n1);
            }
        }
        
    }
}
