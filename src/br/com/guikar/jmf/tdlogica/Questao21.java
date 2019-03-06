/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.guikar.jmf.tdlogica;

import javax.swing.JOptionPane;

/**
 *
 * @author JMF
 */
public class Questao21 {
    public static void main (String[]args){
        double joao=1.45 , maria=1.57 , ano=0;
        JOptionPane.showMessageDialog(null,"Altura de João: "+joao
                +"\nAltura de Maria: "+maria
                +"\nAnos Passados: "+ano);
        while (joao < maria) {
            joao = ( joao + 0.23 );
            maria = ( maria + 0.15 );
            ano = ano + 1;
            JOptionPane.showMessageDialog(null,"Altura de João: "+joao
                +"\nAltura de Maria: "+maria
                +"\nAnos passados: "+ano);
        }
    }
}
