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
public class Questao14 {
    public static void main (String[]args){
        double numero;
        numero=Double.parseDouble(JOptionPane.showInputDialog("Digite o Numero Que Deseja Escrever por Extenso:"));
        if (numero==1){
            JOptionPane.showMessageDialog(null,"Numero por Exteso: Um");
        }
        if (numero==2){
            JOptionPane.showMessageDialog(null,"Numero por Exteso: Dois");
        }
        if (numero==3){
            JOptionPane.showMessageDialog(null,"Numero por Exteso: Trés");
        }
        if (numero==4){
            JOptionPane.showMessageDialog(null,"Numero por Exteso: Quatro");
        }
        if (numero==5){
            JOptionPane.showMessageDialog(null,"Numero por Exteso: Cinco");
        }
        if (numero < 1 | numero> 5 ){
            JOptionPane.showMessageDialog(null,"Numero Invalido");
        }
    }
}
