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
public class Questao19 {
    public static void main (String[]args){
        int idade;
        idade= Integer.parseInt(JOptionPane.showInputDialog("Digite sua Idade"));
        if (idade>=5 && idade<=7){
            JOptionPane.showMessageDialog(null," Categoria: Infantil A");
        }
        if (idade>=8 && idade<=10){
            JOptionPane.showMessageDialog(null," Categoria: Infantil B");
        }
        if (idade>=11 && idade<=13){
            JOptionPane.showMessageDialog(null," Categoria: Juvenil A");
        }
        if (idade>=14 && idade<=17){
            JOptionPane.showMessageDialog(null," Categoria: Juvenil B");
        }
        if (idade>=18 && idade<=25){
            JOptionPane.showMessageDialog(null," Categoria: Sênior");
        }else{
        if (idade<5 || idade>25){
            JOptionPane.showMessageDialog(null," Idade Fora da Faixa Etaria");    
        }
        }
    }
}
