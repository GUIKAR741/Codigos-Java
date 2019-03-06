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
public class Questao17 {
    public static void main (String[]args){
        String nfunc;
        double salario , porcreajuste , sfinal , sreajuste , poreajuste;
        nfunc=JOptionPane.showInputDialog("Nome do Funcionario: ");
        salario=Double.parseDouble(JOptionPane.showInputDialog("Seu Salario"));
        porcreajuste=Double.parseDouble(JOptionPane.showInputDialog("Porcentagem do Reajuste: "));
        poreajuste=(porcreajuste/100);
        sfinal=(salario * poreajuste);
        sreajuste=salario + sfinal;
        JOptionPane.showMessageDialog(null,"Nome do Funcionario: "+nfunc
                +"\nSalario: "+salario
                +"\nPorcentagem do Reajuste: "+porcreajuste
                +"\nValor Acrecentado: "+sfinal
                +"\nSalario reajustado: "+sreajuste);
    }
}
