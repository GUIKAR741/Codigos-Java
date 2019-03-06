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
public class Questao5 {
    public static void main (String []args){
        String aluno;
        double nota1,nota2,nota3,media;
        aluno=JOptionPane.showInputDialog("Digite o Nome do Aluno");
        nota1=Double.parseDouble(JOptionPane.showInputDialog("Digite a Nota do 1ºBimestre:"));
        nota2=Double.parseDouble(JOptionPane.showInputDialog("Digite a Nota do 2ºBimestre:"));
        nota3=Double.parseDouble(JOptionPane.showInputDialog("Digite a Nota do 3ºBimestre:"));
        media=(nota1+nota2+nota3)/3;
        JOptionPane.showMessageDialog(null,"Nome do Aluno: "+aluno+"\nA Media do Aluno é: "+media);
    }
}
