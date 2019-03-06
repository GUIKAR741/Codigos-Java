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
public class Questao25 {
    public static void main(String[]args){
        double  maxima , minima , media , atual;
        atual=Double.parseDouble(JOptionPane.showInputDialog("Quantidade Atual em Estoque: "));
        maxima=Double.parseDouble(JOptionPane.showInputDialog("Quantidade Maxima em Estoque: "));
        minima=Double.parseDouble(JOptionPane.showInputDialog("Quantidade Minima em Estoque: "));
        media=( maxima + minima ) / 2 ;
        if(media<=atual){
            JOptionPane.showMessageDialog(null,"Media de Produtos em Estoque: "+ media+"\nNão Efetuar Compra");
        }else{
            JOptionPane.showMessageDialog(null,"Media de Produtos em Estoque: "+ media+"\nEfetuar Compra");
        }
    }
}
