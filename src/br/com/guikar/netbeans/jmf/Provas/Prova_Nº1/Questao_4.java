/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.guikar.netbeans.jmf.Provas.Prova_Nº1;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Questao_4 {
    public static void main(String[]args){
        int a,b,c,bc,ac,ab;
        a=Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de um lado do triangulo: "));
        b=Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de outro do triangulo: "));
        c=Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do ultimo lado: "));
        bc=b+c;
        ac=a+c;
        ab=a+b;
        if(a<bc){
            JOptionPane.showMessageDialog(null,"Os valores formam um triâgulo.");
        }else if(b<ac){
            JOptionPane.showMessageDialog(null,"Os valores formam um triâgulo.");
        }else if(c<ab){
            JOptionPane.showMessageDialog(null,"Os valores formam um triâgulo.");
        }else{
            JOptionPane.showMessageDialog(null,"Os valores não formam um triâgulo.");
        }
    }
}
