/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.guikar.netbeans.jmf.tdlogica;

import javax.swing.JOptionPane;

/**
 *
 * @author JMF
 */
public class Questao23 {
    public static void main (String[]args){
        double nota1 , nota2 , media;
        nota1=Double.parseDouble(JOptionPane.showInputDialog("Digite a Nota 1°Bimestre: "));
        nota2=Double.parseDouble(JOptionPane.showInputDialog("Digite a Nota 2°Bimestre: "));
        media=(nota1+nota2)/2;
        if (media<6){
            JOptionPane.showMessageDialog(null,"Sua Media é: "+ media+"\nO Aluno foi Reprovado");
        }else{
            JOptionPane.showMessageDialog(null,"Sua Media é: "+ media+"\nO Aluno foi Aprovado");            
        }
    }
}
