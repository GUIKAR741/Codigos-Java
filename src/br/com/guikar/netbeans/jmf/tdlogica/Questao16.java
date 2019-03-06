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
public class Questao16 {
    public static void main (String[]args){
         int salario;
         salario=Integer.parseInt(JOptionPane.showInputDialog("Quantos Salarios Você Ganha? "));
         if (salario<=3) {
             JOptionPane.showMessageDialog(null,"Seu Reajuste foi de 50%" );
         }
         if (salario >=4 && salario<=10) {
             JOptionPane.showMessageDialog(null,"Seu Reajuste foi de 20%" );
         }
         if (salario >=11 && salario<=20){
             JOptionPane.showMessageDialog(null,"Seu Reajuste foi de 15%" );
         }
         if (salario >=21){
             JOptionPane.showMessageDialog(null,"Seu Reajuste foi de 10%" );
         }
    }
}
