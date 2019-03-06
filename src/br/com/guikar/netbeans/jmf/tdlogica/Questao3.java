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
public class Questao3 {
    public static void main (String[]args){
        double distancia,consumo,media;
        distancia=Double.parseDouble(JOptionPane.showInputDialog("Digite a Distancia Percorrida em Km:"));
        consumo=Double.parseDouble(JOptionPane.showInputDialog("Digite o Consumo em Litros:"));
        media=(distancia/consumo);
        JOptionPane.showMessageDialog(null,"Media de Consumo:"+ media);
    }
}
