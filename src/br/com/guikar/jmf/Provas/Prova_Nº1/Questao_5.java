/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.guikar.jmf.Provas.Prova_Nº1;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Questao_5 {
    public static void main (String []args){
        int qatual, qmax, qmin, qmed;
        qatual = Integer.parseInt (JOptionPane.showInputDialog("Digite a quantidade atual em estoque: "));
        qmax = Integer.parseInt (JOptionPane.showInputDialog("Digite a quantidade máxima em estoque: "));
        qmin = Integer.parseInt (JOptionPane.showInputDialog("Digite a quantidade mínima em estoque: "));
        qmed= (qmin+qmax)/2;
        JOptionPane.showMessageDialog(null,"A quantidade média do estoque: "+qmed);
    }
    
}
