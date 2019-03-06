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
public class Questao2 {
    public static void main (String []args){
        int n1,n2, soma,subtracao,multiplicacao,divisao;
        n1=Integer.parseInt(JOptionPane.showInputDialog("Digite um Numero:"));
        n2=Integer.parseInt(JOptionPane.showInputDialog("Digite um Numero:"));
        soma=(n1+n2);
        subtracao=(n1-n2);
        multiplicacao=(n1*n2);
        divisao=(n1/n2);
        JOptionPane.showMessageDialog(null,"O Resultado da Soma é:"+ soma+"\n"+
                "O Resultado da Subtração é:"+ subtracao+"\n"+
                "O Resultado da Multiplicacão é:"+ multiplicacao+"\n"+
                "O Resultado da Divisão é:"+ divisao);
    }
}
