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
public class Questao7 {
    public static void main (String [] args){
        double temp,tempconvert;
        temp=Double.parseDouble(JOptionPane.showInputDialog("Digite uma Temperatura em Celsius: "));
        tempconvert=(9*temp+160)/5;
        JOptionPane.showMessageDialog(null,"Temperatura em Fahrenheit: "+ tempconvert);
    }
}
