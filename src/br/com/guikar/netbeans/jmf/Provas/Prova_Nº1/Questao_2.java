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
public class Questao_2 {
    public static void main (String[]args){
        int velmax,velati,qtdultra,vmulta;
        velmax=Integer.parseInt(JOptionPane.showInputDialog("Digite a velocidade máxima permitida: "));
        velati=Integer.parseInt(JOptionPane.showInputDialog("Digite a velocidade atingida: "));
        qtdultra=(velmax-velati);
        if(qtdultra<=10){
            JOptionPane.showMessageDialog(null,"O valor da multa é de 50 reais.");
        }else if(qtdultra>10 && qtdultra<=30){
            JOptionPane.showMessageDialog(null,"O valor da multa é de 100 reais.");
        }else if(qtdultra>=31){
            JOptionPane.showMessageDialog(null,"O valor da multa é de 200 reais.");
        }
    }
}
